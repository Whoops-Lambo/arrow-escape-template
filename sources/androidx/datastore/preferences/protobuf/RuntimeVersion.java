package androidx.datastore.preferences.protobuf;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class RuntimeVersion {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ProtobufRuntimeVersionException extends RuntimeException {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class RuntimeDomain {
        public static final /* synthetic */ RuntimeDomain[] a = {new RuntimeDomain("GOOGLE_INTERNAL", 0), new RuntimeDomain("PUBLIC", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        RuntimeDomain EF5;

        public static RuntimeDomain valueOf(String str) {
            return (RuntimeDomain) java.lang.Enum.valueOf(RuntimeDomain.class, str);
        }

        public static RuntimeDomain[] values() {
            return (RuntimeDomain[]) a.clone();
        }
    }

    static {
        String.format("%d.%d.%d%s", 4, 28, 2, "");
        Logger.getLogger(RuntimeVersion.class.getName());
    }
}
