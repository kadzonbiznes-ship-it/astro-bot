/*     */ package spinbara.development.bot4life.Utils;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.lang.reflect.Array;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.net.ssl.HttpsURLConnection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DiscordWebhook
/*     */ {
/*     */   private final String url;
/*     */   private String content;
/*     */   private String username;
/*     */   private String avatarUrl;
/*     */   private boolean tts;
/*  28 */   private List<EmbedObject> embeds = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DiscordWebhook(String url) {
/*  36 */     this.url = url;
/*     */   }
/*     */   
/*     */   public void setContent(String content) {
/*  40 */     this.content = content;
/*     */   }
/*     */   
/*     */   public void setUsername(String username) {
/*  44 */     this.username = username;
/*     */   }
/*     */   
/*     */   public void setAvatarUrl(String avatarUrl) {
/*  48 */     this.avatarUrl = avatarUrl;
/*     */   }
/*     */   
/*     */   public void setTts(boolean tts) {
/*  52 */     this.tts = tts;
/*     */   }
/*     */   
/*     */   public void addEmbed(EmbedObject embed) {
/*  56 */     this.embeds.add(embed);
/*     */   }
/*     */   
/*     */   public void execute() throws IOException {
/*  60 */     if (this.content == null && this.embeds.isEmpty()) {
/*  61 */       throw new IllegalArgumentException("Set content or add at least one EmbedObject");
/*     */     }
/*     */     
/*  64 */     JSONObject json = new JSONObject();
/*     */     
/*  66 */     json.put("content", this.content);
/*  67 */     json.put("username", this.username);
/*  68 */     json.put("avatar_url", this.avatarUrl);
/*  69 */     json.put("tts", Boolean.valueOf(this.tts));
/*     */     
/*  71 */     if (!this.embeds.isEmpty()) {
/*  72 */       List<JSONObject> embedObjects = new ArrayList<>();
/*     */       
/*  74 */       for (EmbedObject embed : this.embeds) {
/*  75 */         JSONObject jsonEmbed = new JSONObject();
/*     */         
/*  77 */         jsonEmbed.put("title", embed.getTitle());
/*  78 */         jsonEmbed.put("description", embed.getDescription());
/*  79 */         jsonEmbed.put("url", embed.getUrl());
/*     */         
/*  81 */         if (embed.getColor() != null) {
/*  82 */           Color color = embed.getColor();
/*  83 */           int rgb = color.getRed();
/*  84 */           rgb = (rgb << 8) + color.getGreen();
/*  85 */           rgb = (rgb << 8) + color.getBlue();
/*     */           
/*  87 */           jsonEmbed.put("color", Integer.valueOf(rgb));
/*     */         } 
/*     */         
/*  90 */         EmbedObject.Footer footer = embed.getFooter();
/*  91 */         EmbedObject.Image image = embed.getImage();
/*  92 */         EmbedObject.Thumbnail thumbnail = embed.getThumbnail();
/*  93 */         EmbedObject.Author author = embed.getAuthor();
/*  94 */         List<EmbedObject.Field> fields = embed.getFields();
/*     */         
/*  96 */         if (footer != null) {
/*  97 */           JSONObject jsonFooter = new JSONObject();
/*     */           
/*  99 */           jsonFooter.put("text", footer.getText());
/* 100 */           jsonFooter.put("icon_url", footer.getIconUrl());
/* 101 */           jsonEmbed.put("footer", jsonFooter);
/*     */         } 
/*     */         
/* 104 */         if (image != null) {
/* 105 */           JSONObject jsonImage = new JSONObject();
/*     */           
/* 107 */           jsonImage.put("url", image.getUrl());
/* 108 */           jsonEmbed.put("image", jsonImage);
/*     */         } 
/*     */         
/* 111 */         if (thumbnail != null) {
/* 112 */           JSONObject jsonThumbnail = new JSONObject();
/*     */           
/* 114 */           jsonThumbnail.put("url", thumbnail.getUrl());
/* 115 */           jsonEmbed.put("thumbnail", jsonThumbnail);
/*     */         } 
/*     */         
/* 118 */         if (author != null) {
/* 119 */           JSONObject jsonAuthor = new JSONObject();
/*     */           
/* 121 */           jsonAuthor.put("name", author.getName());
/* 122 */           jsonAuthor.put("url", author.getUrl());
/* 123 */           jsonAuthor.put("icon_url", author.getIconUrl());
/* 124 */           jsonEmbed.put("author", jsonAuthor);
/*     */         } 
/*     */         
/* 127 */         List<JSONObject> jsonFields = new ArrayList<>();
/* 128 */         for (EmbedObject.Field field : fields) {
/* 129 */           JSONObject jsonField = new JSONObject();
/*     */           
/* 131 */           jsonField.put("name", field.getName());
/* 132 */           jsonField.put("value", field.getValue());
/* 133 */           jsonField.put("inline", Boolean.valueOf(field.isInline()));
/*     */           
/* 135 */           jsonFields.add(jsonField);
/*     */         } 
/*     */         
/* 138 */         jsonEmbed.put("fields", jsonFields.toArray());
/* 139 */         embedObjects.add(jsonEmbed);
/*     */       } 
/*     */       
/* 142 */       json.put("embeds", embedObjects.toArray());
/*     */     } 
/*     */     
/* 145 */     URL url = new URL(this.url);
/* 146 */     HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
/* 147 */     connection.addRequestProperty("Content-Type", "application/json");
/* 148 */     connection.addRequestProperty("User-Agent", "Java-DiscordWebhook-BY-Gelox_");
/* 149 */     connection.setDoOutput(true);
/* 150 */     connection.setRequestMethod("POST");
/*     */     
/* 152 */     OutputStream stream = connection.getOutputStream();
/* 153 */     stream.write(json.toString().getBytes());
/* 154 */     stream.flush();
/* 155 */     stream.close();
/*     */     
/* 157 */     connection.getInputStream().close();
/* 158 */     connection.disconnect();
/*     */   }
/*     */   
/*     */   public static class EmbedObject
/*     */   {
/*     */     private String title;
/*     */     private String description;
/*     */     private String url;
/*     */     private Color color;
/*     */     private Footer footer;
/*     */     private Thumbnail thumbnail;
/*     */     private Image image;
/*     */     private Author author;
/* 171 */     private List<Field> fields = new ArrayList<>();
/*     */     
/*     */     public String getTitle() {
/* 174 */       return this.title;
/*     */     }
/*     */     
/*     */     public String getDescription() {
/* 178 */       return this.description;
/*     */     }
/*     */     
/*     */     public String getUrl() {
/* 182 */       return this.url;
/*     */     }
/*     */     
/*     */     public Color getColor() {
/* 186 */       return this.color;
/*     */     }
/*     */     
/*     */     public Footer getFooter() {
/* 190 */       return this.footer;
/*     */     }
/*     */     
/*     */     public Thumbnail getThumbnail() {
/* 194 */       return this.thumbnail;
/*     */     }
/*     */     
/*     */     public Image getImage() {
/* 198 */       return this.image;
/*     */     }
/*     */     
/*     */     public Author getAuthor() {
/* 202 */       return this.author;
/*     */     }
/*     */     
/*     */     public List<Field> getFields() {
/* 206 */       return this.fields;
/*     */     }
/*     */     
/*     */     public EmbedObject setTitle(String title) {
/* 210 */       this.title = title;
/* 211 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject setDescription(String description) {
/* 215 */       this.description = description;
/* 216 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject setUrl(String url) {
/* 220 */       this.url = url;
/* 221 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject setColor(Color color) {
/* 225 */       this.color = color;
/* 226 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject setFooter(String text, String icon) {
/* 230 */       this.footer = new Footer(text, icon);
/* 231 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject setThumbnail(String url) {
/* 235 */       this.thumbnail = new Thumbnail(url);
/* 236 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject setImage(String url) {
/* 240 */       this.image = new Image(url);
/* 241 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject setAuthor(String name, String url, String icon) {
/* 245 */       this.author = new Author(name, url, icon);
/* 246 */       return this;
/*     */     }
/*     */     
/*     */     public EmbedObject addField(String name, String value, boolean inline) {
/* 250 */       this.fields.add(new Field(name, value, inline));
/* 251 */       return this;
/*     */     }
/*     */     
/*     */     private class Footer {
/*     */       private String text;
/*     */       private String iconUrl;
/*     */       
/*     */       private Footer(String text, String iconUrl) {
/* 259 */         this.text = text;
/* 260 */         this.iconUrl = iconUrl;
/*     */       }
/*     */       
/*     */       private String getText() {
/* 264 */         return this.text;
/*     */       }
/*     */       
/*     */       private String getIconUrl() {
/* 268 */         return this.iconUrl;
/*     */       }
/*     */     }
/*     */     
/*     */     private class Thumbnail {
/*     */       private String url;
/*     */       
/*     */       private Thumbnail(String url) {
/* 276 */         this.url = url;
/*     */       }
/*     */       
/*     */       private String getUrl() {
/* 280 */         return this.url;
/*     */       }
/*     */     }
/*     */     
/*     */     private class Image {
/*     */       private String url;
/*     */       
/*     */       private Image(String url) {
/* 288 */         this.url = url;
/*     */       }
/*     */       
/*     */       private String getUrl() {
/* 292 */         return this.url;
/*     */       }
/*     */     }
/*     */     
/*     */     private class Author {
/*     */       private String name;
/*     */       private String url;
/*     */       private String iconUrl;
/*     */       
/*     */       private Author(String name, String url, String iconUrl) {
/* 302 */         this.name = name;
/* 303 */         this.url = url;
/* 304 */         this.iconUrl = iconUrl;
/*     */       }
/*     */       
/*     */       private String getName() {
/* 308 */         return this.name;
/*     */       }
/*     */       
/*     */       private String getUrl() {
/* 312 */         return this.url;
/*     */       }
/*     */       
/*     */       private String getIconUrl() {
/* 316 */         return this.iconUrl;
/*     */       }
/*     */     }
/*     */     
/*     */     private class Field {
/*     */       private String name;
/*     */       private String value;
/*     */       private boolean inline;
/*     */       
/*     */       private Field(String name, String value, boolean inline) {
/* 326 */         this.name = name;
/* 327 */         this.value = value;
/* 328 */         this.inline = inline;
/*     */       }
/*     */       
/*     */       private String getName() {
/* 332 */         return this.name;
/*     */       }
/*     */       
/*     */       private String getValue() {
/* 336 */         return this.value;
/*     */       }
/*     */       
/*     */       private boolean isInline() {
/* 340 */         return this.inline; } } } private class Footer { private String text; private String iconUrl; private Footer(String text, String iconUrl) { this.text = text; this.iconUrl = iconUrl; } private String getText() { return this.text; } private String getIconUrl() { return this.iconUrl; } } private class Thumbnail { private String url; private Thumbnail(String url) { this.url = url; } private String getUrl() { return this.url; } } private class Image { private String url; private Image(String url) { this.url = url; } private String getUrl() { return this.url; } } private class Author { private String name; private String url; private String iconUrl; private Author(String name, String url, String iconUrl) { this.name = name; this.url = url; this.iconUrl = iconUrl; } private String getName() { return this.name; } private String getUrl() { return this.url; } private String getIconUrl() { return this.iconUrl; } } private class Field { private String name; private boolean isInline() { return this.inline; } private String value; private boolean inline; private Field(String name, String value, boolean inline) { this.name = name;
/*     */       this.value = value;
/*     */       this.inline = inline; } private String getName() {
/*     */       return this.name;
/*     */     } private String getValue() {
/*     */       return this.value;
/*     */     } }
/* 347 */    private class JSONObject { private final HashMap<String, Object> map = new HashMap<>();
/*     */     
/*     */     void put(String key, Object value) {
/* 350 */       if (value != null) {
/* 351 */         this.map.put(key, value);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 357 */       StringBuilder builder = new StringBuilder();
/* 358 */       Set<Map.Entry<String, Object>> entrySet = this.map.entrySet();
/* 359 */       builder.append("{");
/*     */       
/* 361 */       int i = 0;
/* 362 */       for (Map.Entry<String, Object> entry : entrySet) {
/* 363 */         Object val = entry.getValue();
/* 364 */         builder.append(quote(entry.getKey())).append(":");
/*     */         
/* 366 */         if (val instanceof String) {
/* 367 */           builder.append(quote(String.valueOf(val)));
/* 368 */         } else if (val instanceof Integer) {
/* 369 */           builder.append(Integer.valueOf(String.valueOf(val)));
/* 370 */         } else if (val instanceof Boolean) {
/* 371 */           builder.append(val);
/* 372 */         } else if (val instanceof JSONObject) {
/* 373 */           builder.append(val.toString());
/* 374 */         } else if (val.getClass().isArray()) {
/* 375 */           builder.append("[");
/* 376 */           int len = Array.getLength(val);
/* 377 */           for (int j = 0; j < len; j++) {
/* 378 */             builder.append(Array.get(val, j).toString()).append((j != len - 1) ? "," : "");
/*     */           }
/* 380 */           builder.append("]");
/*     */         } 
/*     */         
/* 383 */         builder.append((++i == entrySet.size()) ? "}" : ",");
/*     */       } 
/*     */       
/* 386 */       return builder.toString();
/*     */     }
/*     */     
/*     */     private String quote(String string) {
/* 390 */       return "\"" + string + "\"";
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\waria\Desktop\Nowy folder\Bot4life-1.jar!\necek\development\bot4life\Utils\DiscordWebhook.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
