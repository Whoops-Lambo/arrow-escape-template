package defpackage;

import com.google.gson.FieldNamingStrategy;
import com.singular.sdk.internal.UserDetailsUtils;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class em0 implements FieldNamingStrategy {
    public static final yl0 a;
    public static final /* synthetic */ em0[] b;

    static {
        yl0 yl0Var = new yl0();
        a = yl0Var;
        b = new em0[]{yl0Var, new em0() { // from class: zl0
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return em0.b(field.getName());
            }
        }, new em0() { // from class: am0
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return em0.b(em0.a(field.getName(), " "));
            }
        }, new em0() { // from class: bm0
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return em0.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new em0() { // from class: cm0
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return em0.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new em0() { // from class: dm0
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return em0.a(field.getName(), UserDetailsUtils.UserDetailsLiterals.DOT).toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static em0 valueOf(String str) {
        return (em0) Enum.valueOf(em0.class, str);
    }

    public static em0[] values() {
        return (em0[]) b.clone();
    }

    public static String b(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
