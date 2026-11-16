package defpackage;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g83 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final ParsableByteArray a = new ParsableByteArray();
    public final StringBuilder b = new StringBuilder();

    public static String a(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && !z) {
            char c2 = (char) parsableByteArray.getData()[position];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                position++;
                sb.append(c2);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    public static void c(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.bytesLeft() > 0 && z; z = false) {
                char c2 = (char) parsableByteArray.getData()[parsableByteArray.getPosition()];
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    parsableByteArray.skipBytes(1);
                } else {
                    int position = parsableByteArray.getPosition();
                    int iLimit = parsableByteArray.limit();
                    byte[] data = parsableByteArray.getData();
                    int i = position + 2;
                    if (i <= iLimit) {
                        int i2 = position + 1;
                        if (data[position] == 47 && data[i2] == 42) {
                            while (true) {
                                int i3 = i + 1;
                                if (i3 >= iLimit) {
                                    break;
                                }
                                if (((char) data[i]) == '*' && ((char) data[i3]) == '/') {
                                    i += 2;
                                    iLimit = i;
                                } else {
                                    i = i3;
                                }
                            }
                            parsableByteArray.skipBytes(iLimit - parsableByteArray.getPosition());
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(ParsableByteArray parsableByteArray, StringBuilder sb) {
        c(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String strA = a(parsableByteArray, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }
}
