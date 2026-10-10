package org.telegram.margelet;

import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.Theme;

/**
 * Тема по умолчанию в YaicaGram — тёмная с фирменным яичным (жёлтым) акцентом.
 *
 * «Night» — глубокая тёмная основа, а жёлтый берётся готовым акцентом
 * телеграма (яичный желток).
 *
 * Ставится ровно один раз, при первом запуске. Если человек потом выберет
 * другую тему, форк в этот выбор больше не лезет.
 */
public class MargeletTheme {

    private static final int EGG_ACCENT_ID = 3;

    public static void applyOnFirstLaunch() {
        try {
            if (!MargeletConfig.claimFirstLaunch()) {
                return;
            }
            Theme.ThemeInfo night = Theme.getTheme("Night");
            if (night == null) {
                return;
            }
            night.setCurrentAccentId(EGG_ACCENT_ID);
            Theme.saveThemeAccents(night, true, false, true, false);
            Theme.applyTheme(night);
        } catch (Exception e) {
            // Тема — не то, ради чего стоит ронять запуск.
            FileLog.e(e);
        }
    }
}
