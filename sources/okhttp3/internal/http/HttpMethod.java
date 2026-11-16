package okhttp3.internal.http;

import com.ironsource.C4887nc;
import com.safedk.android.a.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HttpMethod {

    @NotNull
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(@NotNull String method) {
        method.getClass();
        if (!method.equals(C4887nc.a) && !method.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static final boolean requiresRequestBody(@NotNull String method) {
        method.getClass();
        if (!method.equals("POST") && !method.equals(g.f) && !method.equals("PATCH") && !method.equals("PROPPATCH") && !method.equals("REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(@NotNull String method) {
        method.getClass();
        if (!method.equals("POST") && !method.equals("PATCH") && !method.equals(g.f) && !method.equals("DELETE") && !method.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(@NotNull String method) {
        method.getClass();
        return !method.equals("PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String method) {
        method.getClass();
        return method.equals("PROPFIND");
    }
}
