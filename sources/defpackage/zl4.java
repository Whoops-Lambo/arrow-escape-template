package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zl4 implements Comparator {
    public static final zl4 a;
    public static final /* synthetic */ zl4[] b;

    static {
        zl4 zl4Var = new zl4("INSTANCE", 0);
        a = zl4Var;
        b = new zl4[]{zl4Var};
    }

    public static zl4[] values() {
        return (zl4[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - (bArr2[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
