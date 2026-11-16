package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/webauthn/Cbor;", "", "Item", "Arg", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo
public final class Cbor {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/webauthn/Cbor$Arg;", "", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Arg {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Arg);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Long.hashCode(0L) * 31);
        }

        public final String toString() {
            return "Arg(arg=0, len=0)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/webauthn/Cbor$Item;", "", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Item);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Item(item=null, len=0)";
        }
    }
}
