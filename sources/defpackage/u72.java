package defpackage;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u72 extends wt0 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable u(int i, ParsableByteArray parsableByteArray) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(parsableByteArray.readLong()));
        }
        if (i == 1) {
            return Boolean.valueOf(parsableByteArray.readUnsignedByte() == 1);
        }
        if (i == 2) {
            return w(parsableByteArray);
        }
        if (i != 3) {
            if (i == 8) {
                return v(parsableByteArray);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(parsableByteArray.readLong()));
                parsableByteArray.skipBytes(2);
                return date;
            }
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            ArrayList arrayList = new ArrayList(unsignedIntToInt);
            for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
                Serializable serializableU = u(parsableByteArray.readUnsignedByte(), parsableByteArray);
                if (serializableU != null) {
                    arrayList.add(serializableU);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strW = w(parsableByteArray);
            int unsignedByte = parsableByteArray.readUnsignedByte();
            if (unsignedByte == 9) {
                return map;
            }
            Serializable serializableU2 = u(unsignedByte, parsableByteArray);
            if (serializableU2 != null) {
                map.put(strW, serializableU2);
            }
        }
    }

    public static HashMap v(ParsableByteArray parsableByteArray) {
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        HashMap map = new HashMap(unsignedIntToInt);
        for (int i = 0; i < unsignedIntToInt; i++) {
            String strW = w(parsableByteArray);
            Serializable serializableU = u(parsableByteArray.readUnsignedByte(), parsableByteArray);
            if (serializableU != null) {
                map.put(strW, serializableU);
            }
        }
        return map;
    }

    public static String w(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return new String(parsableByteArray.getData(), position, unsignedShort);
    }
}
