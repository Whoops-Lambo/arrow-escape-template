package androidx.compose.ui.text.font;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fy;
import defpackage.u12;
import defpackage.vy;
import defpackage.wr0;
import defpackage.wy;
import defpackage.wz2;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AsyncFontListLoader implements State<Object> {
    public final List a;
    public final TypefaceRequest b;
    public final wr0 c;
    public final PlatformFontLoader d;
    public final ParcelableSnapshotMutableState e;
    public boolean f;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x00ed -> B:70:0x00f6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.fy r12) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.c(fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Font font, fy fyVar) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (fyVar instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) fyVar;
            int i = asyncFontListLoader$loadWithTimeoutOrNull$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.u = i - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, fyVar);
            }
        } else {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, fyVar);
        }
        Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.s;
        int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.u;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Font font2 = asyncFontListLoader$loadWithTimeoutOrNull$1.r;
                wz2.a0(obj);
                return obj;
            }
            wz2.a0(obj);
            AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
            asyncFontListLoader$loadWithTimeoutOrNull$1.r = font;
            asyncFontListLoader$loadWithTimeoutOrNull$1.u = 1;
            Object objN = ep0.N(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
            dz dzVar = dz.a;
            return objN == dzVar ? dzVar : objN;
        } catch (CancellationException e) {
            if (!u12.l(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            wy wyVar = (wy) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(vy.a);
            if (wyVar != null) {
                wyVar.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e2));
            }
            return null;
        }
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getA() {
        return this.e.getA();
    }

    public AsyncFontListLoader(List list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, wr0 wr0Var, PlatformFontLoader platformFontLoader) {
        list.getClass();
        obj.getClass();
        typefaceRequest.getClass();
        asyncTypefaceCache.getClass();
        wr0Var.getClass();
        platformFontLoader.getClass();
        this.a = list;
        this.b = typefaceRequest;
        this.c = wr0Var;
        this.d = platformFontLoader;
        this.e = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
        this.f = true;
    }
}
