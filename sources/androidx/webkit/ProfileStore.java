package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UiThread
public interface ProfileStore {
    boolean deleteProfile(@NonNull String str);

    @NonNull
    List<String> getAllProfileNames();

    @NonNull
    Profile getOrCreateProfile(@NonNull String str);

    @Nullable
    Profile getProfile(@NonNull String str);

    @NonNull
    static ProfileStore getInstance() {
        if (WebViewFeatureInternal.l.c()) {
            return ProfileStoreImpl.getInstance();
        }
        throw WebViewFeatureInternal.a();
    }
}
