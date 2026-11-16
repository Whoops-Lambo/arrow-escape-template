package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import androidx.arch.core.util.Function;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.adsurge.adn.E.c;
import com.adsurge.adn.managers.localt.MMPIdFetcher;
import com.adsurge.adn.p037l.e;
import com.adsurge.adn.p053r.f;
import com.adsurge.adn.p053r.j;
import com.applovin.impl.c3;
import com.applovin.impl.h6;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.d;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.internal.Util;
import com.google.android.exoplayer2.video.VideoFrameReleaseHelper;
import com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper$Listener;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.V1;
import com.ironsource.A;
import com.ironsource.B;
import com.ironsource.C4766gg;
import com.ironsource.C4833kc;
import com.ironsource.D;
import com.ironsource.H;
import com.ironsource.InterfaceC4748fg;
import com.mbridge.msdk.config.activity.backdispatcher.b;
import com.mbridge.msdk.config.component.info.provider.listener.a;
import com.mbridge.msdk.config.component.vc.VCCpt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import okhttp3.EventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class hl2 implements Consumer, OnApplyWindowInsetsListener, am2, EventListener.Factory, com.applovin.shadow.okhttp3.EventListener.Factory, Continuation, OnSuccessListener, b, VideoFrameReleaseHelper$DisplayHelper$Listener, SupportSQLiteOpenHelper.Factory, MMPIdFetcher.AllDoneCallback, a, c.d, com.adsurge.adn.d1.b.a, Function, e, d.b, MaxAdapter.OnCompletionListener, InterfaceC4748fg, x4.b, D {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper a(SupportSQLiteOpenHelper.Configuration configuration) {
        SupportSQLiteOpenHelper.Configuration.Builder builder = new SupportSQLiteOpenHelper.Configuration.Builder((Context) this.b);
        builder.b = configuration.b;
        SupportSQLiteOpenHelper.Callback callback = configuration.c;
        callback.getClass();
        builder.c = callback;
        builder.d = true;
        builder.e = true;
        return new FrameworkSQLiteOpenHelperFactory().a(builder.a());
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((y21) this.b).a((CuesWithTiming) obj);
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 17:
                return com.applovin.impl.sdk.ad.b.a((pb3) obj2, (m5) obj);
            default:
                return ((c3) obj2).c((m5) obj);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        et2 et2Var = (et2) this.b;
        FrameLayout frameLayout = et2Var.j;
        view.getClass();
        windowInsetsCompat.getClass();
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        insets.getClass();
        et2Var.k = insets;
        int iOrdinal = et2Var.g.ordinal();
        if (iOrdinal == 1) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), et2Var.k.bottom);
            return windowInsetsCompat;
        }
        if (iOrdinal == 2) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), et2Var.k.top, frameLayout.getPaddingRight(), et2Var.k.bottom);
            return windowInsetsCompat;
        }
        if (iOrdinal != 3) {
            return windowInsetsCompat;
        }
        et2Var.a();
        return windowInsetsCompat;
    }

    @Override // com.applovin.shadow.okhttp3.EventListener.Factory
    public com.applovin.shadow.okhttp3.EventListener create(Call call) {
        return Util.asFactory$lambda$8((com.applovin.shadow.okhttp3.EventListener) this.b, call);
    }

    @Override // defpackage.am2
    public Object execute() {
        int i = this.a;
        int i2 = 10;
        Object obj = this.b;
        switch (i) {
            case 2:
                s62 s62Var = (s62) ((es) obj);
                s62Var.getClass();
                int i3 = js.e;
                m62 m62Var = new m62(2);
                m62Var.c = null;
                m62Var.d = new ArrayList();
                m62Var.e = null;
                m62Var.b = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseD = s62Var.d();
                sQLiteDatabaseD.beginTransaction();
                try {
                    js jsVar = (js) s62.t(sQLiteDatabaseD.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new h10(i2, s62Var, map, m62Var));
                    sQLiteDatabaseD.setTransactionSuccessful();
                    return jsVar;
                } finally {
                    sQLiteDatabaseD.endTransaction();
                }
            case 3:
                s62 s62Var2 = (s62) ((pi0) obj);
                long time = s62Var2.b.getTime() - s62Var2.d.d;
                SQLiteDatabase sQLiteDatabaseD2 = s62Var2.d();
                sQLiteDatabaseD2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor cursorRawQuery = sQLiteDatabaseD2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = cursorRawQuery;
                        while (cursor.moveToNext()) {
                            s62Var2.o(cursor.getInt(0), sf1.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        cursorRawQuery.close();
                        int iDelete = sQLiteDatabaseD2.delete("events", "timestamp_ms < ?", strArr);
                        sQLiteDatabaseD2.setTransactionSuccessful();
                        sQLiteDatabaseD2.endTransaction();
                        return Integer.valueOf(iDelete);
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sQLiteDatabaseD2.endTransaction();
                    throw th2;
                }
            case 4:
                s62 s62Var3 = (s62) ((x03) obj).i;
                SQLiteDatabase sQLiteDatabaseD3 = s62Var3.d();
                sQLiteDatabaseD3.beginTransaction();
                try {
                    sQLiteDatabaseD3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseD3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + s62Var3.b.getTime()).execute();
                    sQLiteDatabaseD3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseD3.endTransaction();
                }
            default:
                m62 m62Var2 = (m62) obj;
                SQLiteDatabase sQLiteDatabaseD4 = ((s62) ((pi0) m62Var2.b)).d();
                sQLiteDatabaseD4.beginTransaction();
                try {
                    List list = (List) s62.t(sQLiteDatabaseD4.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new e32(i2));
                    sQLiteDatabaseD4.setTransactionSuccessful();
                    sQLiteDatabaseD4.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ls) m62Var2.d).I((hr2) it.next(), 1, false);
                    }
                    return null;
                } catch (Throwable th3) {
                    sQLiteDatabaseD4.endTransaction();
                    throw th3;
                }
        }
    }

    @Override // com.adsurge.adn.p037l.e
    public Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 20:
                return ((com.adsurge.adn.p053r.d) obj).d();
            case 23:
                return ((f) obj).d();
            default:
                return ((j) obj).d();
        }
    }

    @Override // com.adsurge.adn.managers.localt.MMPIdFetcher.AllDoneCallback
    public void onAllDone(List list) {
        ((com.adsurge.adn.managers.localt.a) this.b).c(list);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
    public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
        com.applovin.impl.mediation.f.a((x4) this.b, initializationStatus, str);
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper$DisplayHelper$Listener
    public void onDefaultDisplayChanged(Display display) {
        ((VideoFrameReleaseHelper) this.b).updateDefaultDisplayRefreshRateParams(display);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                V1.a((w01) obj2, obj);
                break;
            default:
                com.vungle.ads.internal.platform.c.a((com.vungle.ads.internal.platform.c) obj2, (AppSetIdInfo) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(okhttp3.Call call) {
        return okhttp3.internal.Util.m1367asFactory$lambda8((EventListener) this.b, call);
    }

    @Override // com.mbridge.msdk.config.activity.backdispatcher.b
    public void a() {
        ((VCCpt) this.b).n();
    }

    @Override // com.adsurge.adn.d1.b.a
    public void a(float f) {
        ((com.adsurge.adn.p053r.b) this.b).a(f);
    }

    @Override // com.ironsource.InterfaceC4748fg
    public void a(sr0 sr0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 25:
                C4766gg.a((com.ironsource.environment.thread.b) obj, sr0Var);
                break;
            default:
                C4766gg.a((Handler) obj, sr0Var);
                break;
        }
    }

    @Override // com.adsurge.adn.E.c.d
    public void a(c.C0071c c0071c) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 15:
                ((com.adsurge.adn.p021f1.a) obj).a(c0071c);
                break;
            default:
                com.adsurge.adn.f1.e.a.a((com.adsurge.adn.p021f1.f) obj, c0071c);
                break;
        }
    }

    @Override // com.applovin.impl.sdk.d.b
    public void a(d.a aVar) {
        ((com.applovin.impl.sdk.e) this.b).c(aVar);
    }

    @Override // com.mbridge.msdk.config.component.info.provider.listener.a
    public void a(Map map) {
        ((com.mbridge.msdk.config.component.info.provider.a) this.b).b(map);
    }

    @Override // com.applovin.impl.x4.b
    public void a(boolean z, Object obj, Object obj2) {
        ((h6) this.b).a(z, (t2) obj, (Exception) obj2);
    }

    @Override // com.ironsource.D
    public A a(B b, H h) {
        return C4833kc.a((C4833kc) this.b, b, h);
    }
}
