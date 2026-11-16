package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
class AnimationHandler {
    public static final ThreadLocal f = new ThreadLocal();
    public FrameCallbackProvider16 d;
    public final SimpleArrayMap a = new SimpleArrayMap(0);
    public final ArrayList b = new ArrayList();
    public final AnimationCallbackDispatcher c = new AnimationCallbackDispatcher();
    public boolean e = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AnimationFrameCallback {
        boolean a(long j);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                SystemClock.uptimeMillis();
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {
        public final Choreographer b;
        public final Choreographer.FrameCallback c;

        public final void a() {
            this.b.postFrameCallback(this.c);
        }

        public FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.b = Choreographer.getInstance();
            this.c = new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    AnimationHandler animationHandler = AnimationHandler.this;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList arrayList = animationHandler.b;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    for (int i = 0; i < arrayList.size(); i++) {
                        AnimationFrameCallback animationFrameCallback = (AnimationFrameCallback) arrayList.get(i);
                        if (animationFrameCallback != null) {
                            SimpleArrayMap simpleArrayMap = animationHandler.a;
                            Long l = (Long) simpleArrayMap.get(animationFrameCallback);
                            if (l == null) {
                                animationFrameCallback.a(jUptimeMillis);
                            } else if (l.longValue() < jUptimeMillis2) {
                                simpleArrayMap.remove(animationFrameCallback);
                                animationFrameCallback.a(jUptimeMillis);
                            }
                        }
                    }
                    if (animationHandler.e) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            if (arrayList.get(size) == null) {
                                arrayList.remove(size);
                            }
                        }
                        animationHandler.e = false;
                    }
                    if (arrayList.size() > 0) {
                        if (animationHandler.d == null) {
                            animationHandler.d = new FrameCallbackProvider16(animationHandler.c);
                        }
                        animationHandler.d.a();
                    }
                }
            };
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnimationCallbackDispatcher {
        public AnimationCallbackDispatcher() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class AnimationFrameCallbackProvider {
        public final AnimationCallbackDispatcher a;

        public AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.a = animationCallbackDispatcher;
        }
    }
}
