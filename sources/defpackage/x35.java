package defpackage;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class x35 extends EncodedKeySpec {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x35(byte[] bArr, int i) {
        super(bArr);
        this.a = i;
    }

    @Override // java.security.spec.EncodedKeySpec
    public final String getFormat() {
        switch (this.a) {
        }
        return "raw";
    }
}
