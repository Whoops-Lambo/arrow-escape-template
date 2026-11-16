package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.ironsource.Z5;
import com.unity3d.services.core.device.Storage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidStorageManager;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "<init>", "()V", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)Z", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Lcom/unity3d/ads/core/data/manager/LegacyStorageType;", "type", "Laz2;", "initStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "Lcom/unity3d/services/core/device/Storage;", "getStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Lcom/unity3d/services/core/device/Storage;", "hasStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Z", "", Z5.c.b, "addStorageLocation", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;Ljava/lang/String;)V", "removeStorage", "hasInitialized", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidStorageManager implements StorageManager {

    @NotNull
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(@NotNull com.unity3d.services.core.device.StorageManager.StorageType type, @NotNull String fileName) {
        type.getClass();
        fileName.getClass();
        com.unity3d.services.core.device.StorageManager.addStorageLocation(type, fileName);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    @NotNull
    public Storage getStorage(@NotNull com.unity3d.services.core.device.StorageManager.StorageType type) {
        type.getClass();
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(type);
        storage.getClass();
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(@NotNull com.unity3d.services.core.device.StorageManager.StorageType type) {
        type.getClass();
        return com.unity3d.services.core.device.StorageManager.hasStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(@NotNull Context context) {
        context.getClass();
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(@NotNull com.unity3d.services.core.device.StorageManager.StorageType type) {
        type.getClass();
        com.unity3d.services.core.device.StorageManager.initStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(@NotNull com.unity3d.services.core.device.StorageManager.StorageType type) {
        type.getClass();
        com.unity3d.services.core.device.StorageManager.removeStorage(type);
    }
}
