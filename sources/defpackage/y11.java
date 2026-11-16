package defpackage;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class y11 {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d9 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01f9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0130, please report this as an issue */
    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        String strG;
        String message;
        int i;
        int i2;
        int iC;
        int iC2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iC3 = c(index, i3, str);
            if (a(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iC4 = c(i3, i4, str);
            if (a(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iC5 = c(i4, i5, str);
            boolean zA = a(str, i5, 'T');
            if (!zA && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC3, iC4 - 1, iC5);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i6 = i4 + 5;
                int iC6 = c(i4 + 3, i6, str);
                if (a(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iC7 = c(i6, i7, str);
                if (a(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() <= i7 || (cCharAt2 = str.charAt(i7)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i5 = i7;
                    i = iC6;
                    i2 = iC7;
                } else {
                    int i8 = i7 + 2;
                    iC2 = c(i7, i8, str);
                    if (iC2 > 59 && iC2 < 63) {
                        iC2 = 59;
                    }
                    if (a(str, i8, '.')) {
                        int i9 = i7 + 3;
                        int i10 = i7 + 4;
                        while (true) {
                            if (i10 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i10);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i10++;
                            }
                            length2 = i10;
                            break;
                        }
                        int iMin = Math.min(length2, i7 + 6);
                        iC = c(i9, iMin, str);
                        int i11 = iMin - i9;
                        if (i11 == 1) {
                            iC *= 100;
                        } else if (i11 == 2) {
                            iC *= 10;
                        }
                        i = iC6;
                        i5 = length2;
                        i2 = iC7;
                    } else {
                        i = iC6;
                        i5 = i8;
                        i2 = iC7;
                        iC = 0;
                    }
                }
                if (str.length() > i5) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i5);
                timeZone = a;
                if (cCharAt == 'Z') {
                    length = i5 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i5);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i5 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                        str2 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str2);
                        id = timeZone.getID();
                        if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iC3);
                gregorianCalendar2.set(2, iC4 - 1);
                gregorianCalendar2.set(5, iC5);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, iC2);
                gregorianCalendar2.set(14, iC);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            i2 = 0;
            iC = 0;
            iC2 = 0;
            if (str.length() > i5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i5);
            timeZone = a;
            if (cCharAt == 'Z') {
                length = i5 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i5);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i5 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    id = timeZone.getID();
                    if (!id.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iC3);
            gregorianCalendar3.set(2, iC4 - 1);
            gregorianCalendar3.set(5, iC5);
            gregorianCalendar3.set(11, i);
            gregorianCalendar3.set(12, i2);
            gregorianCalendar3.set(13, iC2);
            gregorianCalendar3.set(14, iC);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            if (str == null) {
                strG = null;
            } else {
                strG = n30.g('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(pv1.o("Failed to parse date [", strG, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str == null) {
                strG = null;
            } else {
                strG = n30.g('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(pv1.o("Failed to parse date [", strG, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e3) {
            e = e3;
            if (str == null) {
                strG = null;
            } else {
                strG = n30.g('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(pv1.o("Failed to parse date [", strG, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int c(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }

    public static boolean a(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }
}
