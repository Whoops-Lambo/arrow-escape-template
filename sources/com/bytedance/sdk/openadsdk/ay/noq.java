package com.bytedance.sdk.openadsdk.ay;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class noq {
    private WeakReference<fi> ahm;
    private Context kgy;
    private Map<String, kgy> rz = new HashMap();
    private SensorEventListener uq = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ay.noq.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            fi fiVarUq;
            if (sensorEvent.sensor.getType() != 1 || (fiVarUq = noq.this.uq()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                fiVarUq.kgy("accelerometer_callback", jSONObject);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/", "VOAekA2vZtWjQtZTixSk", 48);
            }
        }
    };
    private SensorEventListener ct = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ay.noq.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            fi fiVarUq;
            if (sensorEvent.sensor.getType() != 4 || (fiVarUq = noq.this.uq()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                fiVarUq.kgy("gyro_callback", jSONObject);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+8", "VOAekA2vZtWjQtZTixSk", 76);
            }
        }
    };
    private SensorEventListener noq = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ay.noq.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            fi fiVarUq;
            if (sensorEvent.sensor.getType() != 10 || (fiVarUq = noq.this.uq()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                fiVarUq.kgy("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+9", "VOAekA2vZtWjQtZTixSk", 104);
            }
        }
    };
    private SensorEventListener yo = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ay.noq.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = ra.ahm;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = ra.rz;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = ra.uq;
            SensorManager.getRotationMatrix(fArr5, null, ra.ahm, ra.rz);
            float[] fArr6 = ra.ct;
            SensorManager.getOrientation(fArr5, fArr6);
            fi fiVarUq = noq.this.uq();
            if (fiVarUq == null) {
                return;
            }
            float f = fArr6[0];
            float f2 = fArr6[1];
            float f3 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                fiVarUq.kgy("rotation_vector_callback", jSONObject);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+6", "VOAekA2vZtWjQtZTixSk", 143);
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        JSONObject kgy(JSONObject jSONObject) throws Throwable;
    }

    private void rz() {
        this.rz.put("adInfo", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.45
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                if (fiVarUq == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectFpp = fiVarUq.fpp();
                if (jSONObjectFpp != null) {
                    jSONObjectFpp.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObjectFpp;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                return jSONObject3;
            }
        });
        this.rz.put("appInfo", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.56
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = noq.this.kgy().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                fi fiVarUq = noq.this.uq();
                if (fiVarUq != null) {
                    jSONObject2.put("deviceId", fiVarUq.yo());
                    jSONObject2.put("netType", fiVarUq.dg());
                    jSONObject2.put("innerAppName", fiVarUq.uq());
                    jSONObject2.put("appName", fiVarUq.ct());
                    jSONObject2.put(C4664b4.j.W, fiVarUq.noq());
                    Map<String, String> mapAhm = fiVarUq.ahm();
                    for (String str : mapAhm.keySet()) {
                        jSONObject2.put(str, mapAhm.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.rz.put("playableSDKInfo", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.62
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(R6.F, "android");
                return jSONObject2;
            }
        });
        this.rz.put("subscribe_app_ad", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.63
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ay.kgy kgyVarCt = noq.this.ct();
                JSONObject jSONObject2 = new JSONObject();
                if (kgyVarCt == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("download_app_ad", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.64
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ay.kgy kgyVarCt = noq.this.ct();
                JSONObject jSONObject2 = new JSONObject();
                if (kgyVarCt == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put(C4664b4.i.o, new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.2
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                if (fiVarUq == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject3.put("viewStatus", fiVarUq.gf());
                return jSONObject3;
            }
        });
        this.rz.put("getVolume", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.3
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                if (fiVarUq == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject3.put("endcard_mute", fiVarUq.fi());
                return jSONObject3;
            }
        });
        this.rz.put("getScreenSize", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.4
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                if (fiVarUq == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectUm = fiVarUq.um();
                jSONObjectUm.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectUm;
            }
        });
        this.rz.put("start_accelerometer_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.5
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/fg==", "UuA7mgi5", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE);
                        yo.kgy("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ra.kgy(noq.this.kgy, noq.this.uq, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("close_accelerometer_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.6
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ra.kgy(noq.this.kgy, noq.this.uq);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/eQ==", "UuA7mgi5", 336);
                    yo.kgy("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.rz.put("start_gyro_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.7
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/eA==", "UuA7mgi5", 358);
                        yo.kgy("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ra.ahm(noq.this.kgy, noq.this.ct, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("close_gyro_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.8
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ra.kgy(noq.this.kgy, noq.this.ct);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/ew==", "UuA7mgi5", 375);
                    yo.kgy("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.rz.put("start_accelerometer_grativityless_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.9
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/eg==", "UuA7mgi5", 396);
                        yo.kgy("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ra.rz(noq.this.kgy, noq.this.noq, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("close_accelerometer_grativityless_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.10
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ra.kgy(noq.this.kgy, noq.this.noq);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/dQ==", "UuA7mgi5", TTAdConstant.VIDEO_INFO_CODE);
                    yo.kgy("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.rz.put("start_rotation_vector_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.11
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+/dA==", "UuA7mgi5", 435);
                        yo.kgy("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ra.uq(noq.this.kgy, noq.this.yo, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("close_rotation_vector_observer", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.13
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ra.kgy(noq.this.kgy, noq.this.yo);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+8fQ==", "UuA7mgi5", 452);
                    yo.kgy("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.rz.put("device_shake", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.14
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ra.kgy(noq.this.kgy, 300L);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+8fA==", "UuA7mgi5", 470);
                    yo.kgy("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.rz.put("device_shake_short", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.15
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ra.kgy(noq.this.kgy, 150L);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLR+8fw==", "UuA7mgi5", 487);
                    yo.kgy("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.rz.put("playable_style", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.16
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectRz = fiVarUq.rz();
                jSONObjectRz.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectRz;
            }
        });
        this.rz.put("sendReward", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.17
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.gm();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playableInteractionTriggered", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.18
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.ay();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("webview_time_track", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.19
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.rz.put("playable_event", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.20
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null || jSONObject == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.ahm(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("reportAd", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.21
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.22
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("openAdLandPageLinks", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.24
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("get_viewport", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.25
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSx = fiVarUq.sx();
                jSONObjectSx.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectSx;
            }
        });
        this.rz.put("jssdk_load_finish", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.26
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.bmz();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_material_render_result", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.27
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.gf(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("detect_change_playable_click", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.28
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectRa = fiVarUq.ra();
                jSONObjectRa.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectRa;
            }
        });
        this.rz.put("check_camera_permission", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.29
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectTwf = fiVarUq.twf();
                jSONObjectTwf.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectTwf;
            }
        });
        this.rz.put("check_external_storage", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.30
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectKus = fiVarUq.kus();
                if (jSONObjectKus.isNull("result")) {
                    jSONObjectKus.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObjectKus;
                }
                jSONObjectKus.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectKus;
            }
        });
        this.rz.put("playable_open_camera", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.31
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_pick_photo", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.32
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_download_media_in_photos", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.33
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.kgy(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_preventTouchEvent", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.35
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.ahm(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_settings_info", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.36
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectVs = fiVarUq.vs();
                jSONObjectVs.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectVs;
            }
        });
        this.rz.put("playable_load_main_scene", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.37
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.ioy();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_enter_section", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.38
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.uq(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_end", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.39
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.lqi();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_finish_play_playable", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.40
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.fpz();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_transfrom_module_show", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.41
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.jpc();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_transfrom_module_change_color", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.42
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.ft();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_set_scroll_rect", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.43
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_click_area", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.44
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.ct(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_real_play_start", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.46
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_material_first_frame_show", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.47
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.wy();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_stuck_check_pong", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.48
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.uf();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_material_adnormal_mask", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.49
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                fiVarUq.noq(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_long_press_panel", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.50
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_alpha_player_play", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.51
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_transfrom_module_highlight", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.52
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_send_click_event", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.53
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_query_media_permission_declare", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.54
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectYo = fiVarUq.yo(jSONObject);
                jSONObjectYo.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectYo;
            }
        });
        this.rz.put("playable_query_media_permission_enable", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.55
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                fi fiVarUq = noq.this.uq();
                JSONObject jSONObject2 = new JSONObject();
                if (fiVarUq == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectFi = fiVarUq.fi(jSONObject);
                jSONObjectFi.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectFi;
            }
        });
        this.rz.put("playable_apply_media_permission", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.57
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ay.kgy kgyVarCt = noq.this.ct();
                JSONObject jSONObject2 = new JSONObject();
                if (kgyVarCt == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_start_kws", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.58
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ay.kgy kgyVarCt = noq.this.ct();
                JSONObject jSONObject2 = new JSONObject();
                if (kgyVarCt == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_close_kws", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.59
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ay.kgy kgyVarCt = noq.this.ct();
                JSONObject jSONObject2 = new JSONObject();
                if (kgyVarCt == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_video_preload_task_add", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.60
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ay.kgy kgyVarCt = noq.this.ct();
                JSONObject jSONObject2 = new JSONObject();
                if (kgyVarCt == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.rz.put("playable_video_preload_task_cancel", new kgy() { // from class: com.bytedance.sdk.openadsdk.ay.noq.61
            @Override // com.bytedance.sdk.openadsdk.ay.noq.kgy
            public JSONObject kgy(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ay.kgy kgyVarCt = noq.this.ct();
                JSONObject jSONObject2 = new JSONObject();
                if (kgyVarCt == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fi uq() {
        WeakReference<fi> weakReference = this.ahm;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void ahm() {
        ra.kgy(this.kgy, this.uq);
        ra.kgy(this.kgy, this.ct);
        ra.kgy(this.kgy, this.noq);
        ra.kgy(this.kgy, this.yo);
    }

    public JSONObject kgy(String str, JSONObject jSONObject) {
        try {
            kgy kgyVar = this.rz.get(str);
            if (kgyVar != null) {
                return kgyVar.kgy(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
            return jSONObject2;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKqWfVPhRWnLQ==", "UuA7mgi5", 1180);
            yo.kgy("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    public noq(fi fiVar) {
        this.kgy = fiVar.kgy();
        this.ahm = new WeakReference<>(fiVar);
        rz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.ay.kgy ct() {
        fi fiVarUq = uq();
        if (fiVarUq == null) {
            return null;
        }
        return fiVarUq.xh();
    }

    public Set<String> kgy() {
        return this.rz.keySet();
    }
}
