package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import defpackage.d;
import defpackage.kj1;
import defpackage.lk1;
import defpackage.vq2;
import defpackage.x2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public MediaBrowserServiceImplApi23 a;

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass1 extends Result<List<MediaBrowserCompat$MediaItem>> {
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass2 extends Result<MediaBrowserCompat$MediaItem> {
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass3 extends Result<List<MediaBrowserCompat$MediaItem>> {
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass4 extends Result<Bundle> {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class BrowserRoot {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ConnectionRecord implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ConnectionRecord$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface MediaBrowserServiceImpl {
        void onCreate();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl {
        public final ArrayList a = new ArrayList();
        public MediaBrowserService b;
        public Messenger c;

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes8.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes8.dex */
        class AnonymousClass2 extends Result<List<MediaBrowserCompat$MediaItem>> {
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes8.dex */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes8.dex */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RequiresApi
        public class MediaBrowserServiceApi21 extends MediaBrowserService {
            public MediaBrowserServiceApi21(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result result) {
                MediaBrowserServiceCompat.this.b();
            }

            @Override // android.service.media.MediaBrowserService
            public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                lk1.a(bundle);
                MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21 = MediaBrowserServiceImplApi21.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                int i2 = -1;
                if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
                    bundle2.remove("extra_client_version");
                    mediaBrowserServiceImplApi21.c = new Messenger((Handler) null);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("extra_service_version", 2);
                    bundle3.putBinder("extra_messenger", mediaBrowserServiceImplApi21.c.getBinder());
                    mediaBrowserServiceImplApi21.a.add(bundle3);
                    i2 = bundle2.getInt("extra_calling_pid", -1);
                    bundle2.remove("extra_calling_pid");
                }
                new HashMap();
                if (str != null) {
                    if (!TextUtils.isEmpty(str)) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            x2.r(i2, i, str);
                        }
                        if (mediaBrowserServiceCompat.a() == null) {
                            return null;
                        }
                        if (mediaBrowserServiceImplApi21.c == null) {
                            throw null;
                        }
                        throw null;
                    }
                    d.r("packageName should be nonempty");
                    throw null;
                }
                d.w("package shouldn't be null");
                throw null;
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi21 mediaBrowserServiceApi21 = new MediaBrowserServiceApi21(MediaBrowserServiceCompat.this);
            this.b = mediaBrowserServiceApi21;
            mediaBrowserServiceApi21.onCreate();
        }

        public MediaBrowserServiceImplApi21() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes3.dex */
        class AnonymousClass1 extends Result<MediaBrowserCompat$MediaItem> {
            public final /* synthetic */ ResultWrapper c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, ResultWrapper resultWrapper) {
                super(str);
                this.c = resultWrapper;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result result) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, new ResultWrapper(result));
                if (anonymousClass1.b) {
                    vq2.v(str, "sendResult() called when either sendResult() or sendError() had already been called for: ");
                } else {
                    anonymousClass1.b = true;
                    anonymousClass1.c.a.sendResult(null);
                }
            }

            public MediaBrowserServiceApi23(MediaBrowserServiceImplApi23 mediaBrowserServiceImplApi23, Context context) {
                super(context);
            }
        }

        public MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(this, MediaBrowserServiceCompat.this);
            this.b = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes9.dex */
        class AnonymousClass1 extends Result<List<MediaBrowserCompat$MediaItem>> {
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public MediaBrowserServiceApi26(Context context) {
                super(MediaBrowserServiceImplApi26.this, context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
                lk1.a(bundle);
                MediaBrowserServiceCompat.this.b();
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public final void onCreate() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.b = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public final void onCreate() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ServiceBinderImpl {

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass5 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass6 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$7, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass7 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$8, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass8 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$ServiceBinderImpl$9, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        class AnonymousClass9 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ServiceCallbacks {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ServiceCallbacksCompat implements ServiceCallbacks {
    }

    public abstract BrowserRoot a();

    public abstract void b();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Result<T> {
        public final Object a;
        public boolean b;

        public Result(Object obj) {
            this.a = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class ResultWrapper<T> {
        public final MediaBrowserService.Result a;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.a = result;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class ServiceHandler extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    lk1.a(data.getBundle("data_root_hints"));
                    data.getString("data_package_name");
                    data.getInt("data_calling_pid");
                    data.getInt("data_calling_uid");
                    throw null;
                case 2:
                    throw null;
                case 3:
                    lk1.a(data.getBundle("data_options"));
                    data.getString("data_media_item_id");
                    data.getBinder("data_callback_token");
                    throw null;
                case 4:
                    data.getString("data_media_item_id");
                    data.getBinder("data_callback_token");
                    throw null;
                case 5:
                    data.getString("data_media_item_id");
                    throw null;
                case 6:
                    lk1.a(data.getBundle("data_root_hints"));
                    data.getString("data_package_name");
                    data.getInt("data_calling_pid");
                    data.getInt("data_calling_uid");
                    throw null;
                case 7:
                    throw null;
                case 8:
                    lk1.a(data.getBundle("data_search_extras"));
                    data.getString("data_search_query");
                    throw null;
                case 9:
                    lk1.a(data.getBundle("data_custom_action_extras"));
                    data.getString("data_custom_action");
                    throw null;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(kj1.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a.b.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a = new MediaBrowserServiceImplApi28();
        } else if (i >= 26) {
            this.a = new MediaBrowserServiceImplApi26();
        } else {
            this.a = new MediaBrowserServiceImplApi23();
        }
        this.a.onCreate();
    }
}
