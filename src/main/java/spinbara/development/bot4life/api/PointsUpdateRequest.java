package spinbara.development.bot4life.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Żądanie wysłania punktów do API.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointsUpdateRequest {

    private String license;
    private int minutes;
}

