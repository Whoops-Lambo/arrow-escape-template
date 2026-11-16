package io.p071bidmachine.nativead;

import android.net.Uri;
import com.moloco.sdk.internal.error.crash.data.local.g;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import io.p071bidmachine.ImageDataImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(g gVar, int i) {
        super(1);
        this.i = i;
        this.j = gVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        g gVar = this.j;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                uri.getClass();
                ImageDataImpl imageDataImpl = ((f) gVar.e).l;
                if (imageDataImpl != null) {
                    imageDataImpl.setLocalUri(uri);
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                uri2.getClass();
                ImageDataImpl imageDataImpl2 = ((f) gVar.e).m;
                if (imageDataImpl2 != null) {
                    imageDataImpl2.setLocalUri(uri2);
                }
                break;
        }
        return az2Var;
    }
}
