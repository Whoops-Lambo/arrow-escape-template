package com.unity3d.mediation.adapters.levelplay;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface;
import defpackage.e80;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LevelPlayBaseAdapter extends BaseAdapter implements AdapterMetaDataInterface, AdapterAdaptiveInterface, AdapterTestModeInterface {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private boolean mAdapterDebug;

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface
    public int getAdaptiveHeight(int i) {
        return -1;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(@Nullable String str, @Nullable List<String> list) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface
    public void setTestMode(boolean z) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Companion {
        @Nullable
        public final String networkAdapterVersion() {
            return null;
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        private Companion() {
        }
    }

    @Nullable
    public static final String networkAdapterVersion() {
        return Companion.networkAdapterVersion();
    }

    public boolean isAdaptersDebugEnabled() {
        return this.mAdapterDebug;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
        this.mAdapterDebug = z;
    }
}
