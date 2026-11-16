package defpackage;

import com.applovin.impl.r5;
import com.applovin.impl.r8;
import com.applovin.impl.s3;
import com.applovin.impl.w2;
import com.inmobi.media.C4287p2;
import com.inmobi.media.C4346r6;
import com.inmobi.media.C4460v9;
import com.ironsource.C5047wb;
import com.ironsource.sdk.controller.v;
import com.vungle.ads.internal.t2;
import com.vungle.ads.internal.ui.x;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                C4287p2.a((C4287p2) obj);
                break;
            case 1:
                ((r5) obj).e();
                break;
            case 2:
                ((r8) obj).a();
                break;
            case 3:
                ((s3) obj).notifyDataSetChanged();
                break;
            case 4:
                t2.a((t2) obj);
                break;
            case 5:
                ((v) obj).C();
                break;
            case 6:
                C4460v9.a((C4346r6) obj);
                break;
            case 7:
                ((w2) obj).notifyDataSetChanged();
                break;
            case 8:
                C5047wb.b((Class) obj);
                break;
            default:
                x.a(true, (x) obj);
                break;
        }
    }
}
