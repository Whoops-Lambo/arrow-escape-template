package defpackage;

import com.google.android.gms.internal.play_billing.zzby;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum bx3 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final x24 c;
    public final int a;

    static {
        zzby zzbyVar = new zzby();
        for (bx3 bx3Var : values()) {
            Integer numValueOf = Integer.valueOf(bx3Var.a);
            int i = zzbyVar.b + 1;
            Object[] objArr = zzbyVar.a;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                zzbyVar.a = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = zzbyVar.a;
            int i3 = zzbyVar.b;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = bx3Var;
            zzbyVar.b = i3 + 1;
        }
        w04 w04Var = zzbyVar.c;
        if (w04Var != null) {
            throw w04Var.a();
        }
        x24 x24VarH = x24.h(zzbyVar.b, zzbyVar.a, zzbyVar);
        w04 w04Var2 = zzbyVar.c;
        if (w04Var2 != null) {
            throw w04Var2.a();
        }
        c = x24VarH;
    }

    bx3(int i) {
        this.a = i;
    }
}
