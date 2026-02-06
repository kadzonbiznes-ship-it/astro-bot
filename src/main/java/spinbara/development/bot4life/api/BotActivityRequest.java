package spinbara.development.bot4life.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Żądanie raportu aktywności bota do API.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BotActivityRequest {

    private String license;
    private String action;
}

