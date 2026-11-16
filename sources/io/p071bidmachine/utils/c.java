package io.p071bidmachine.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import io.p071bidmachine.core.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final int[] a = {1};
    public static final HashMap b = new HashMap(1);
    public static final b c = new b();
    public static boolean d = false;

    public static HashSet a(Context context) {
        BluetoothProfile bluetoothProfile;
        if (j.j(context, "android.permission.BLUETOOTH")) {
            try {
                if (BluetoothAdapter.getDefaultAdapter() != null) {
                    HashSet hashSet = new HashSet();
                    try {
                        for (Map.Entry entry : b.entrySet()) {
                            if (((Integer) entry.getKey()).equals(1) && (bluetoothProfile = (BluetoothProfile) entry.getValue()) != null) {
                                Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
                                while (it.hasNext()) {
                                    String name = it.next().getName();
                                    if (!TextUtils.isEmpty(name)) {
                                        hashSet.add(name);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return hashSet;
                }
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }
}
