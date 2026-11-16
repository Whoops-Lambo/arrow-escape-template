package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.OutputConfiguration;
import com.unity3d.player.C5270p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class mf3 extends C5270p {
    public static HashMap F;
    public String E;

    @Override // com.unity3d.player.C5270p
    public final void createCaptureSession(CameraCaptureSession.StateCallback stateCallback) throws CameraAccessException {
        OutputConfiguration outputConfiguration = new OutputConfiguration(this.w);
        String str = this.E;
        if (str != null) {
            outputConfiguration.setPhysicalCameraId(str);
        }
        CameraDevice cameraDevice = this.b;
        ra3.p();
        cameraDevice.createCaptureSession(ra3.l(Collections.singletonList(outputConfiguration), new bf3(this.d, 0), stateCallback));
    }

    @Override // com.unity3d.player.C5270p
    public final CameraCaptureSession.CaptureCallback getCaptureCallback() {
        if (this.s == null) {
            this.s = new xe3(this);
        }
        return this.s;
    }

    public static String[] i(Context context) throws CameraAccessException {
        String[] cameraIdList = C5270p.getCameraManager(context).getCameraIdList();
        ArrayList arrayList = new ArrayList();
        F = new HashMap();
        for (String str : cameraIdList) {
            arrayList.add(str);
            F.put(str, str);
        }
        for (String str2 : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = C5270p.getCameraManager(context).getCameraCharacteristics(str2);
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (iArr[i] == 11) {
                        uj2.a(4, "Camera2 " + str2 + " is a logical camera backed by two or more physical cameras");
                        for (String str3 : cameraCharacteristics.getPhysicalCameraIds()) {
                            if (arrayList.indexOf(str3) == -1) {
                                arrayList.add(str3);
                                F.put(str3, str2);
                            }
                            uj2.a(4, "Physical camera2 found : " + str3);
                        }
                        break;
                    }
                    i++;
                } else {
                    uj2.a(4, "Camera2 " + str2 + " is a simple camera");
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.unity3d.player.C5270p
    public final String getCameraIdToOpen(Context context, int i) {
        String str = C5270p.getCameraIds(context)[i];
        String str2 = (String) F.get(str);
        if (str2.equals(str)) {
            this.E = null;
            return str;
        }
        this.E = str;
        return str2;
    }
}
