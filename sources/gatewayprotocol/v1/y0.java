package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements Internal.EnumVerifier {
    public static final y0 a = new y0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (NativeConfigurationOuterClass.ShowCompletionState.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
