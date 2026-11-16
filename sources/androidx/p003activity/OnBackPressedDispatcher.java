package androidx.p003activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.az2;
import defpackage.g8;
import defpackage.gy;
import defpackage.rc1;
import defpackage.s71;
import defpackage.sr0;
import defpackage.wr0;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final g8 b = new g8();
    public OnBackPressedCallback c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/BackEventCompat;", "backEvent", "Laz2;", "invoke", "(Landroidx/activity/BackEventCompat;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass1 extends rc1 implements wr0 {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            Object objPrevious;
            BackEventCompat backEventCompat = (BackEventCompat) obj;
            backEventCompat.getClass();
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            g8 g8Var = onBackPressedDispatcher.b;
            ListIterator listIterator = g8Var.listIterator(g8Var.getH());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((OnBackPressedCallback) objPrevious).a);
            OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
            if (onBackPressedDispatcher.c != null) {
                onBackPressedDispatcher.b();
            }
            onBackPressedDispatcher.c = onBackPressedCallback;
            if (onBackPressedCallback != null) {
                onBackPressedCallback.d(backEventCompat);
            }
            return az2.a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/BackEventCompat;", "backEvent", "Laz2;", "invoke", "(Landroidx/activity/BackEventCompat;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass2 extends rc1 implements wr0 {
        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            Object objPrevious;
            BackEventCompat backEventCompat = (BackEventCompat) obj;
            backEventCompat.getClass();
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            OnBackPressedCallback onBackPressedCallback = onBackPressedDispatcher.c;
            if (onBackPressedCallback == null) {
                g8 g8Var = onBackPressedDispatcher.b;
                ListIterator listIterator = g8Var.listIterator(g8Var.getH());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!((OnBackPressedCallback) objPrevious).a);
                onBackPressedCallback = (OnBackPressedCallback) objPrevious;
            }
            if (onBackPressedCallback != null) {
                onBackPressedCallback.c(backEventCompat);
            }
            return az2.a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass3 extends rc1 implements sr0 {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            OnBackPressedDispatcher.this.c();
            return az2.a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass4 extends rc1 implements sr0 {
        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            OnBackPressedDispatcher.this.b();
            return az2.a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass5 extends rc1 implements sr0 {
        public AnonymousClass5() {
            super(0);
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            OnBackPressedDispatcher.this.c();
            return az2.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        public final Lifecycle a;
        public final OnBackPressedCallback b;
        public Cancellable c;
        public final /* synthetic */ OnBackPressedDispatcher d;

        @Override // androidx.p003activity.Cancellable
        public final void cancel() {
            this.a.c(this);
            OnBackPressedCallback onBackPressedCallback = this.b;
            onBackPressedCallback.getClass();
            onBackPressedCallback.b.remove(this);
            Cancellable cancellable = this.c;
            if (cancellable != null) {
                ((OnBackPressedCancellable) cancellable).cancel();
            }
            this.c = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedCallback onBackPressedCallback = this.b;
                onBackPressedCallback.getClass();
                OnBackPressedDispatcher onBackPressedDispatcher = this.d;
                onBackPressedDispatcher.b.addLast(onBackPressedCallback);
                OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(onBackPressedDispatcher, onBackPressedCallback);
                onBackPressedCallback.b.add(onBackPressedCancellable);
                onBackPressedDispatcher.e();
                onBackPressedCallback.c = new OnBackPressedDispatcher$addCancellableCallback$1(0, onBackPressedDispatcher, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
                this.c = onBackPressedCancellable;
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.c;
                if (cancellable != null) {
                    ((OnBackPressedCancellable) cancellable).cancel();
                }
            }
        }

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            onBackPressedCallback.getClass();
            this.d = onBackPressedDispatcher;
            this.a = lifecycle;
            this.b = onBackPressedCallback;
            lifecycle.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class OnBackPressedCancellable implements Cancellable {
        public final OnBackPressedCallback a;
        public final /* synthetic */ OnBackPressedDispatcher b;

        @Override // androidx.p003activity.Cancellable
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.b;
            g8 g8Var = onBackPressedDispatcher.b;
            OnBackPressedCallback onBackPressedCallback = this.a;
            g8Var.remove(onBackPressedCallback);
            if (s71.b(onBackPressedDispatcher.c, onBackPressedCallback)) {
                onBackPressedCallback.a();
                onBackPressedDispatcher.c = null;
            }
            onBackPressedCallback.getClass();
            onBackPressedCallback.b.remove(this);
            sr0 sr0Var = onBackPressedCallback.c;
            if (sr0Var != null) {
                sr0Var.invoke();
            }
            onBackPressedCallback.c = null;
        }

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            onBackPressedCallback.getClass();
            this.b = onBackPressedDispatcher;
            this.a = onBackPressedCallback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "dispatcher", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "callback", "Laz2;", "b", "(Ljava/lang/Object;ILjava/lang/Object;)V", "c", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "a", "(Lsr0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        public static final Api33Impl a = new Api33Impl();

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback a(@NotNull sr0 onBackInvoked) {
            onBackInvoked.getClass();
            return new gy(onBackInvoked, 2);
        }

        @DoNotInline
        public final void b(@NotNull Object dispatcher, int priority, @NotNull Object callback) {
            dispatcher.getClass();
            callback.getClass();
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        public final void c(@NotNull Object dispatcher, @NotNull Object callback) {
            dispatcher.getClass();
            callback.getClass();
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001JS\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Laz2;", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(Lwr0;Lwr0;Lsr0;Lsr0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        public static final Api34Impl a = new Api34Impl();

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback a(@NotNull final wr0 onBackStarted, @NotNull final wr0 onBackProgressed, @NotNull final sr0 onBackInvoked, @NotNull final sr0 onBackCancelled) {
            onBackStarted.getClass();
            onBackProgressed.getClass();
            onBackInvoked.getClass();
            onBackCancelled.getClass();
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public final void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                public final void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    backEvent.getClass();
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                public final void onBackStarted(BackEvent backEvent) {
                    backEvent.getClass();
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    public final void b() {
        Object objPrevious;
        OnBackPressedCallback onBackPressedCallback = this.c;
        if (onBackPressedCallback == null) {
            g8 g8Var = this.b;
            ListIterator<E> listIterator = g8Var.listIterator(g8Var.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((OnBackPressedCallback) objPrevious).a);
            onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        }
        this.c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.a();
        }
    }

    public final void c() {
        Object objPrevious;
        OnBackPressedCallback onBackPressedCallback = this.c;
        if (onBackPressedCallback == null) {
            g8 g8Var = this.b;
            ListIterator listIterator = g8Var.listIterator(g8Var.getH());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((OnBackPressedCallback) objPrevious).a);
            onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        }
        this.c = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.b();
        } else {
            this.a.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        Api33Impl api33Impl = Api33Impl.a;
        if (z && !this.f) {
            api33Impl.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            api33Impl.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z = this.g;
        boolean z2 = false;
        g8 g8Var = this.b;
        if (g8Var == null || !g8Var.isEmpty()) {
            Iterator it = g8Var.iterator();
            while (it.hasNext()) {
                if (((OnBackPressedCallback) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = Api34Impl.a.a(new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), new AnonymousClass4());
            } else {
                onBackInvokedCallbackA = Api33Impl.a.a(new AnonymousClass5());
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        lifecycleOwner.getClass();
        onBackPressedCallback.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getD() == Lifecycle.State.a) {
            return;
        }
        onBackPressedCallback.b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.c = new OnBackPressedDispatcher$addCallback$1(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }
}
