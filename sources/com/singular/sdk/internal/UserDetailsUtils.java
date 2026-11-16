package com.singular.sdk.internal;

import com.inmobi.media.core.config.models.AdConfig;
import com.singular.sdk.SingularUserDetails;
import defpackage.n30;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class UserDetailsUtils {
    static final int MIN_PHONE_DIGITS = 6;
    static final int SHA256_HEX_LENGTH = 64;
    private static final SingularLog logger = SingularLog.getLogger("UserDetailsUtils");
    private static final char[] HEX = "0123456789abcdef".toCharArray();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface UserDetailsLiterals {
        public static final String AT = "@";
        public static final String DOT = ".";
        public static final String GMAIL_DOMAIN = "@gmail.com";
        public static final String GOOGLEMAIL_DOMAIN = "@googlemail.com";
        public static final String NON_DIGIT_REGEX = "[^0-9]";
        public static final String PLUS = "+";
        public static final String PLUS_TAG_REGEX = "\\+.*";
        public static final String SHA256_HEX_PREFIX_REGEX = "[0-9a-fA-F]{64,}";
        public static final String SHA256_HEX_REGEX = "[0-9a-fA-F]{64}";
    }

    public static boolean isUserDetailsPayloadEmpty(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            if (!Constants.UserDetails.MODE_KEY.equals(itKeys.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum HashingMode {
        DEV_HASHED(0),
        SDK_HASHED(1);

        final int value;

        HashingMode(int i) {
            this.value = i;
        }
    }

    public static JSONObject buildUserDetailsPayloadJson(Map<String, String> map, HashingMode hashingMode) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put(Constants.UserDetails.MODE_KEY, hashingMode.value);
        return jSONObject;
    }

    private static boolean isGmail(String str) {
        return str.endsWith(UserDetailsLiterals.GMAIL_DOMAIN) || str.endsWith(UserDetailsLiterals.GOOGLEMAIL_DOMAIN);
    }

    public static Map<String, String> normalize(SingularUserDetails singularUserDetails) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (singularUserDetails == null) {
            return linkedHashMap;
        }
        normalizeEmailInto(singularUserDetails.getEmail(), linkedHashMap);
        normalizePhoneInto(singularUserDetails.getPhoneNumber(), linkedHashMap);
        return linkedHashMap;
    }

    private static String normalizeGmailLocalPart(String str) {
        int iIndexOf = str.indexOf(UserDetailsLiterals.AT);
        if (iIndexOf < 0) {
            return str;
        }
        String strSubstring = str.substring(0, iIndexOf);
        return n30.m(strSubstring.replaceAll(UserDetailsLiterals.PLUS_TAG_REGEX, "").replace(UserDetailsLiterals.DOT, ""), str.substring(iIndexOf));
    }

    private static String normalizePhoneDigits(String str) {
        String strReplaceAll = str.replaceAll(UserDetailsLiterals.NON_DIGIT_REGEX, "");
        if (Utils.isEmptyOrNull(strReplaceAll)) {
            return null;
        }
        return strReplaceAll;
    }

    private UserDetailsUtils() {
    }

    public static boolean isUserDetailsValueHashed(String str) {
        if (Utils.isEmptyOrNull(str)) {
            return false;
        }
        return str.trim().matches(UserDetailsLiterals.SHA256_HEX_PREFIX_REGEX);
    }

    public static boolean isValidHashedValue(String str) {
        if (Utils.isEmptyOrNull(str)) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.contains(UserDetailsLiterals.AT)) {
            logger.error("setUserDetails: pre-hashed value looks like a raw email (contains '@'). Pass raw email/phone and the SDK will hash them, or pass a SHA-256 hex string to the pre-hashed setters.");
            return false;
        }
        if (!strTrim.matches(UserDetailsLiterals.SHA256_HEX_REGEX)) {
            logger.error("setUserDetails: pre-hashed value is not a valid SHA-256 hex string.");
            return false;
        }
        return true;
    }

    public static boolean isValidRawEmail(String str) {
        String strTrim;
        int iIndexOf;
        int iIndexOf2;
        if (!Utils.isEmptyOrNull(str) && (iIndexOf = (strTrim = str.trim()).indexOf(UserDetailsLiterals.AT)) >= 0) {
            int i = iIndexOf + 1;
            if (strTrim.indexOf(UserDetailsLiterals.AT, i) == -1 && (iIndexOf2 = strTrim.indexOf(UserDetailsLiterals.DOT, i)) != -1 && iIndexOf2 < strTrim.length() - 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidRawPhone(String str) {
        if (Utils.isEmptyOrNull(str) || str.replaceAll(UserDetailsLiterals.NON_DIGIT_REGEX, "").length() < 6) {
            return false;
        }
        return true;
    }

    private static void normalizeEmailInto(String str, Map<String, String> map) {
        if (Utils.isEmptyOrNull(str)) {
            logger.debug("normalize: no email provided, skipping email variants");
            return;
        }
        try {
            String strNormalizeEmailStandard = normalizeEmailStandard(str);
            if (!Utils.isEmptyOrNull(strNormalizeEmailStandard)) {
                map.put(Constants.UserDetails.EMAIL_STD_KEY, strNormalizeEmailStandard);
                if (isGmail(strNormalizeEmailStandard)) {
                    map.put(Constants.UserDetails.EMAIL_NODOTS_KEY, normalizeGmailLocalPart(strNormalizeEmailStandard));
                }
            }
        } catch (Throwable th) {
            logger.error("normalize: failed to normalize email", th);
            SingularInstance.collectError("e175");
        }
    }

    private static String normalizeEmailStandard(String str) {
        return str.trim().toLowerCase(Locale.ROOT);
    }

    private static String normalizePhoneE164(String str) {
        String strTrim = str.trim();
        boolean zStartsWith = strTrim.startsWith(UserDetailsLiterals.PLUS);
        String strReplaceAll = strTrim.replaceAll(UserDetailsLiterals.NON_DIGIT_REGEX, "");
        if (Utils.isEmptyOrNull(strReplaceAll)) {
            return null;
        }
        if (zStartsWith) {
            return n30.y(UserDetailsLiterals.PLUS, strReplaceAll);
        }
        return strReplaceAll;
    }

    private static void normalizePhoneInto(String str, Map<String, String> map) {
        if (Utils.isEmptyOrNull(str)) {
            logger.debug("normalize: no phone provided, skipping phone variants");
            return;
        }
        try {
            String strNormalizePhoneE164 = normalizePhoneE164(str);
            if (!Utils.isEmptyOrNull(strNormalizePhoneE164)) {
                map.put(Constants.UserDetails.PHONE_E164_KEY, strNormalizePhoneE164);
            }
        } catch (Throwable th) {
            logger.error("normalize: failed to normalize phone to E.164", th);
            SingularInstance.collectError("e176");
        }
        try {
            String strNormalizePhoneDigits = normalizePhoneDigits(str);
            if (!Utils.isEmptyOrNull(strNormalizePhoneDigits)) {
                map.put(Constants.UserDetails.PHONE_DIGITS_KEY, strNormalizePhoneDigits);
            }
        } catch (Throwable th2) {
            logger.error("normalize: failed to normalize phone to digits", th2);
            SingularInstance.collectError("e177");
        }
    }

    public static String sha256Hex(String str) {
        if (Utils.isEmptyOrNull(str)) {
            logger.debug("sha256Hex: empty or null value, nothing to hash");
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            char[] cArr = new char[bArrDigest.length * 2];
            for (int i = 0; i < bArrDigest.length; i++) {
                byte b = bArrDigest[i];
                int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i3 = i * 2;
                char[] cArr2 = HEX;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Throwable th) {
            logger.error("sha256Hex: failed to hash user details value", th);
            SingularInstance.collectError("e180");
            return null;
        }
    }
}
