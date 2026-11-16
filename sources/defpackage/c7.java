package defpackage;

import android.webkit.SafeBrowsingResponse;
import dalvik.system.DelegateLastClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c7 {
    public static /* bridge */ /* synthetic */ SafeBrowsingResponse a(Object obj) {
        return (SafeBrowsingResponse) obj;
    }

    public static /* synthetic */ DelegateLastClassLoader b(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* synthetic */ InMemoryDexClassLoader c(ByteBuffer[] byteBufferArr, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBufferArr, classLoader);
    }

    public static /* synthetic */ void d() {
    }
}
