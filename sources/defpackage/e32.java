package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import com.farimarwat.grizzly.ReportActivity;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.StarRating;
import com.google.android.exoplayer2.ThumbRating;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e32 implements wa0, OnApplyWindowInsetsListener, q62, Consumer, Continuation, ListenerSet.Event, Bundleable.Creator, gp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ e32(lt0 lt0Var) {
        this.a = 16;
    }

    public static /* synthetic */ void a() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void b(int i, long j) throws IOException {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new rb0(str + obj + obj2);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void n(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        SampleQueue.lambda$new$0((g72) obj);
    }

    @Override // defpackage.q62
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            byte[] bArrDecode = null;
            if (string == null) {
                d.w("Null backendName");
                return null;
            }
            xy1 xy1VarB = yy1.b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArrDecode = Base64.decode(string2, 0);
            }
            arrayList.add(new eg(string, bArrDecode, xy1VarB));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.a) {
            case 19:
                return StarRating.fromBundle(bundle);
            case 20:
            default:
                return Tracks.lambda$static$0(bundle);
            case 21:
                return ThumbRating.fromBundle(bundle);
            case 22:
                return Timeline.fromBundle(bundle);
            case 23:
                return Timeline.Period.fromBundle(bundle);
            case 24:
                return Timeline.Window.fromBundle(bundle);
            case 25:
                return TrackGroup.lambda$static$0(bundle);
            case 26:
                return TrackGroupArray.lambda$static$0(bundle);
            case 27:
                return TrackSelectionOverride.lambda$static$0(bundle);
            case 28:
                return TrackSelectionParameters.fromBundle(bundle);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(StringBuilder sb, int i, int i2) {
        sb.append(i);
        sb.append((char) i2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        return ReportActivity.onCreate$lambda$0(view, windowInsetsCompat);
    }

    @Override // defpackage.wa0
    public void d(Provider provider) {
        provider.get().getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            od odVar = (od) task.getResult();
            ng1 ng1Var = ng1.h;
            ng1Var.l("Crashlytics report successfully enqueued to DataTransport: " + odVar.b);
            File file = odVar.c;
            z = true;
            if (file.delete()) {
                ng1Var.l("Deleted report file: " + file.getPath());
            } else {
                ng1Var.B("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ e32(int i) {
        this.a = i;
    }
}
