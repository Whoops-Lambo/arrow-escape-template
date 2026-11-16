package com.unity3d.services.core.device;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import defpackage.du;
import defpackage.e80;
import defpackage.er;
import defpackage.gg0;
import defpackage.np1;
import defpackage.qb5;
import defpackage.wr0;
import defpackage.xi2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/services/core/misc/JsonStorage;", "", "_targetFileName", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "type", "<init>", "(Ljava/lang/String;Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "", "readStorage", "()Z", "initStorage", "writeStorage", "clearStorage", "storageFileExists", "Lcom/unity3d/services/core/device/StorageEvent;", "eventType", "", "value", "Laz2;", "sendEvent", "(Lcom/unity3d/services/core/device/StorageEvent;Ljava/lang/Object;)V", "Ljava/lang/String;", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "getType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Storage extends JsonStorage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final np1 onStorageEventCallbacks = qb5.a(gg0.a);

    @NotNull
    private final String _targetFileName;

    @NotNull
    private final StorageManager.StorageType type;

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        boolean z = false;
        try {
            try {
                byte[] fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
                if (fileBytes == null) {
                    return false;
                }
                setData(new JSONObject(new String(fileBytes, er.a)));
                z = true;
            } catch (Exception e) {
                DeviceLog.debug("Failed to read storage JSON file:", e);
            }
        } catch (FileNotFoundException e2) {
            DeviceLog.debug("Storage JSON file not found in local cache:", e2);
        }
        return z;
    }

    public final synchronized void sendEvent(@Nullable StorageEvent eventType, @Nullable Object value) {
        List list = (List) ((xi2) onStorageEventCallbacks).getValue();
        if (list.isEmpty()) {
            return;
        }
        eventType.getClass();
        StorageEventInfo storageEventInfo = new StorageEventInfo(eventType, this.type, value);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((wr0) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\tR,\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/device/Storage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "Laz2;", "callback", "addStorageEventCallback", "(Lwr0;)V", "removeStorageEventCallback", "Lnp1;", "", "onStorageEventCallbacks", "Lnp1;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        public final void addStorageEventCallback(@NotNull wr0 callback) {
            xi2 xi2Var;
            Object value;
            callback.getClass();
            np1 np1Var = Storage.onStorageEventCallbacks;
            do {
                xi2Var = (xi2) np1Var;
                value = xi2Var.getValue();
            } while (!xi2Var.i(value, du.p0((List) value, callback)));
        }

        public final void removeStorageEventCallback(@NotNull wr0 callback) {
            xi2 xi2Var;
            Object value;
            callback.getClass();
            np1 np1Var = Storage.onStorageEventCallbacks;
            do {
                xi2Var = (xi2) np1Var;
                value = xi2Var.getValue();
            } while (!xi2Var.i(value, du.m0((List) value, callback)));
        }

        private Companion() {
        }
    }

    @NotNull
    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public Storage(@NotNull String str, @NotNull StorageManager.StorageType storageType) {
        str.getClass();
        storageType.getClass();
        this._targetFileName = str;
        this.type = storageType;
    }
}
