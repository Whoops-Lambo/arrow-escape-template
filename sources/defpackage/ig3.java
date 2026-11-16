package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.inmobi.media.C4346r6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ig3 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4346r6 b;

    public /* synthetic */ ig3(C4346r6 c4346r6, int i) {
        this.a = i;
        this.b = c4346r6;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        C4346r6 c4346r6 = this.b;
        switch (i) {
            case 0:
                return C4346r6.c(c4346r6, view, motionEvent);
            case 1:
                return C4346r6.d(c4346r6, view, motionEvent);
            case 2:
                return C4346r6.b(c4346r6, view, motionEvent);
            default:
                return C4346r6.a(c4346r6, view, motionEvent);
        }
    }
}
