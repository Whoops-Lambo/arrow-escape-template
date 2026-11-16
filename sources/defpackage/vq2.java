package defpackage;

import android.database.SQLException;
import android.os.Bundle;
import androidx.arch.core.util.Function;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.media3.database.DatabaseIOException;
import androidx.work.impl.model.WorkSpec;
import com.adsurge.adn.oversea_ad.Solar;
import com.bykv.vk.openvk.preload.geckox.b.b;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.firebase.datatransport.TransportRegistrar;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vq2 implements Bundleable.Creator, lr2, yv, VisualTransformation, Function {
    public final /* synthetic */ int a;

    @Override // defpackage.lr2
    public void b(Exception exc) {
    }

    public /* synthetic */ vq2(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void d(int i, String str) throws ParserException {
        throw new ParserException(str + i);
    }

    public static /* synthetic */ void f(long j, String str) {
        throw new IllegalArgumentException(str + j);
    }

    public static /* synthetic */ void g(SQLException sQLException) throws DatabaseIOException {
        throw new DatabaseIOException(sQLException);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new kb1(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new Solar(str);
    }

    public static /* synthetic */ void k(String str, Object obj, long j, Object obj2, Throwable th) {
        throw new b(str + obj + ((Object) ", pkg id:") + j + ((Object) ", caused by:") + obj2, th);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) throws IOException {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Throwable th) throws IOException {
        throw new IOException(str + obj + obj2 + obj3, th);
    }

    public static /* synthetic */ void n(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void t(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void u(String str) throws ParserException {
        throw new ParserException(str);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void w(String str) throws FileNotFoundException {
        throw new FileNotFoundException(str);
    }

    public static /* synthetic */ void x(Object obj, String str) throws SSLPeerUnverifiedException {
        throw new SSLPeerUnverifiedException(str + obj);
    }

    public static /* synthetic */ void y(String str) {
        throw new SecurityException(str);
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        List list = (List) obj;
        String str = WorkSpec.u;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(eu.f(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkSpec.WorkInfoPojo) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.a) {
            case 0:
                return Tracks.Group.lambda$static$0(bundle);
            default:
                return VideoSize.lambda$static$0(bundle);
        }
    }

    @Override // defpackage.yv
    public Object h(lt0 lt0Var) {
        switch (this.a) {
            case 2:
                return TransportRegistrar.lambda$getComponents$0(lt0Var);
            case 3:
                return TransportRegistrar.lambda$getComponents$1(lt0Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(lt0Var);
        }
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void o(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void q(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText a(AnnotatedString annotatedString) {
        annotatedString.getClass();
        return new TransformedText(annotatedString);
    }
}
