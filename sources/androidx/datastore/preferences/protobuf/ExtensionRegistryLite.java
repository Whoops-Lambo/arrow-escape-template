package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ExtensionRegistryLite {
    public static volatile ExtensionRegistryLite b;
    public static final ExtensionRegistryLite c = new ExtensionRegistryLite();
    public final Map a = Collections.EMPTY_MAP;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ExtensionClassHolder {
        static {
            try {
                Class.forName("androidx.datastore.preferences.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ObjectIntPair {
        public final Object a;
        public final int b;

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.a == objectIntPair.a && this.b == objectIntPair.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }

        public ObjectIntPair(int i, MessageLite messageLite) {
            this.a = messageLite;
            this.b = i;
        }
    }

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite extensionRegistryLite;
        Protobuf protobuf = Protobuf.c;
        ExtensionRegistryLite extensionRegistryLite2 = b;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = b;
                if (extensionRegistryLite == null) {
                    Class cls = ExtensionRegistryFactory.a;
                    ExtensionRegistryLite extensionRegistryLite3 = null;
                    if (cls != null) {
                        try {
                            extensionRegistryLite3 = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    extensionRegistryLite = extensionRegistryLite3 != null ? extensionRegistryLite3 : c;
                    b = extensionRegistryLite;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionRegistryLite;
    }
}
