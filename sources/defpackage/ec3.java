package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum ec3 {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");

    public static final HashMap f = new HashMap();
    public final String a;

    static {
        for (ec3 ec3Var : values()) {
            f.put(ec3Var.a, ec3Var);
        }
    }

    ec3(String str) {
        this.a = str;
    }
}
