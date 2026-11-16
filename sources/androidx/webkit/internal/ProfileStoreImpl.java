package androidx.webkit.internal;

import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import defpackage.ak;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ProfileStoreImpl implements ProfileStore {
    public static ProfileStoreImpl b;
    public final ProfileStoreBoundaryInterface a;

    public static ProfileStore getInstance() {
        if (b == null) {
            b = new ProfileStoreImpl(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.a.getProfileStore());
        }
        return b;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (WebViewFeatureInternal.l.c()) {
            return this.a.deleteProfile(str);
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (WebViewFeatureInternal.l.c()) {
            return this.a.getAllProfileNames();
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Profile getOrCreateProfile(String str) {
        if (WebViewFeatureInternal.l.c()) {
            return new ProfileImpl((ProfileBoundaryInterface) ak.b(ProfileBoundaryInterface.class, this.a.getOrCreateProfile(str)));
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Profile getProfile(String str) {
        if (!WebViewFeatureInternal.l.c()) {
            throw WebViewFeatureInternal.a();
        }
        InvocationHandler profile = this.a.getProfile(str);
        if (profile != null) {
            return new ProfileImpl((ProfileBoundaryInterface) ak.b(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }

    public ProfileStoreImpl(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.a = profileStoreBoundaryInterface;
    }
}
