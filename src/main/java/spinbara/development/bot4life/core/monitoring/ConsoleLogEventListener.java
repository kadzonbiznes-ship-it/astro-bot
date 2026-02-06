package spinbara.development.bot4life.core.monitoring;

/**
 * Observer dla zdarzeń wyczytanych z logów konsoli MTA.
 */
public interface ConsoleLogEventListener {

    void onFullBackpack();

    void onAdminDetected(String adminNick);
}

