package uz.bnpl.client.util;

import lombok.experimental.UtilityClass;
import org.apache.tomcat.util.http.parser.AcceptLanguage;
import uz.bnpl.client.constant.Language;

@UtilityClass
public class LanguageUtil {

    public static Language translate(AcceptLanguage acceptLanguage) {
        if (acceptLanguage == null || acceptLanguage.getLocale() == null) {
            return Language.UZ;
        }

        return switch (acceptLanguage.getLocale().getLanguage()) {
            case "uz" -> Language.UZ;
            case "ru" -> Language.RU;
            default -> Language.EN;
        };
    }

}
