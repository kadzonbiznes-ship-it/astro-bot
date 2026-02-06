package spinbara.development.bot4life.config;

public final class Constants {

    private Constants() {}

    public static final int MAX_COAL = 100;
    public static final int DEFAULT_ACCURACY = 1000;
    public static final int DEFAULT_DELAY = 50;
    public static final int DEFAULT_MINE_END_DELAY = 260;
    public static final int ANIMATION_FPS = 60;
    public static final int FRAME_DELAY_MS = 16;

    public static final String PREDICT_API_URL = "http://localhost:5000/predict";
    public static final String POINTS_API_URL = "http://localhost:3000/api/points";
    public static final String ACTIVITY_API_URL = "http://localhost:3000/api/bot/activity";
    public static final String LOCAL_TOKEN = "local";

    public static final String BOT_DIR = "C:/4lifebot";
    public static final String SETTINGS_FILE = BOT_DIR + "/settings.astrobot";
    public static final String BYPASS_DIR = BOT_DIR + "/bypass";
    public static final String CONSOLE_LOG_PATH = "C:\\Program Files (x86)\\MTA San Andreas 1.6\\MTA\\logs\\console.log";
    public static final String FULL_BACKPACK_MESSAGE = "Nie możesz nosić już więcej węgla - oddaj go do wagonu!";
    public static final String SOUND_FULL_BACKPACK = "images/fullplecak.wav";
    public static final String SOUND_ADMIN = "images/admin.wav";
    public static final int GRID_PATTERN_SIZE = 500;
    public static final int GRID_SIZE = 25;
    public static final int DOT_RADIUS = 2;
    public static final int MTA_CHECK_INTERVAL_MS = 1000;
    public static final int MTA_MONITOR_INTERVAL_MS = 2000;
    public static final long CACHE_DURATION_MS = 1000;

    public static final int CONNECT_TIMEOUT_MS = 400;
    public static final int REQUEST_TIMEOUT_MS = 900;
}
