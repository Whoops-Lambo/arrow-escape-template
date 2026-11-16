package defpackage;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzguh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class to4 extends zzguh {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    public final uo4 a() {
        IBinder iBinder;
        if (this.g == 63 && (iBinder = this.a) != null) {
            return new uo4(iBinder, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.g & 16) == 0) {
            sb.append(" theme");
        }
        if ((this.g & 32) == 0) {
            sb.append(" windowWidthPx");
        }
        e32.i("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
