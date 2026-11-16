package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vs2 implements Comparable {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return s71.h(this.a & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, ((vs2) obj).a & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vs2) {
            return this.a == ((vs2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public /* synthetic */ vs2(byte b) {
        this.a = b;
    }
}
