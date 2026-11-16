package androidx.browser.auth;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.p003activity.result.contract.ActivityResultContract;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class AuthTabIntent {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AuthResult {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AuthenticateUserResultContract extends ActivityResultContract<Intent, AuthResult> {
        @Override // androidx.p003activity.result.contract.ActivityResultContract
        public final Object c(int i, Intent intent) {
            if (i == -1 && intent != null) {
                intent.getData();
            }
            return new AuthResult();
        }

        @Override // androidx.p003activity.result.contract.ActivityResultContract
        public final Intent a(Context context, Object obj) {
            return (Intent) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ResultCode {
    }
}
