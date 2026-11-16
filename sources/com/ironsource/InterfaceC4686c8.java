package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4686c8<T> {

    /* JADX INFO: renamed from: com.ironsource.c8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a<ListenerType> implements InterfaceC4686c8<ListenerType> {

        @Nullable
        private ListenerType a;

        /* JADX INFO: renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class C1362a extends com.ironsource.environment.thread.a {
            final /* synthetic */ Runnable b;

            public C1362a(Runnable runnable) {
                this.b = runnable;
            }

            @Override // com.ironsource.environment.thread.a
            public void a() {
                this.b.run();
            }
        }

        public final void b(@Nullable ListenerType listenertype) {
            this.a = listenertype;
        }

        public final void a(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            IronLog.CALLBACK.info(str2 + " instanceId=" + str);
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                defpackage.d.u("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
                return;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final void a(@NotNull Runnable runnable, boolean z) {
            runnable.getClass();
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C1362a(runnable), 0L, 2, null);
            }
        }

        @Nullable
        public final ListenerType a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4686c8
        public void a(ListenerType listenertype) {
            this.a = listenertype;
        }
    }

    void a(T t);
}
