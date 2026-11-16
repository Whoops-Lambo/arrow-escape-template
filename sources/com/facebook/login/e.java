package com.facebook.login;

import com.facebook.FacebookRequestError;
import com.facebook.g0;
import com.facebook.n0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.yb0;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements g0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeviceAuthDialog b;

    public /* synthetic */ e(DeviceAuthDialog deviceAuthDialog, int i) {
        this.a = i;
        this.b = deviceAuthDialog;
    }

    @Override // com.facebook.g0
    public final void onCompleted(n0 n0Var) {
        int i = this.a;
        DeviceAuthDialog deviceAuthDialog = this.b;
        switch (i) {
            case 0:
                n0Var.getClass();
                if (!deviceAuthDialog.e.get()) {
                    FacebookRequestError facebookRequestError = n0Var.d;
                    if (facebookRequestError != null) {
                        int i2 = facebookRequestError.c;
                        if (i2 == 1349174 || i2 == 1349172) {
                            deviceAuthDialog.j();
                        } else if (i2 == 1349152) {
                            DeviceAuthDialog.RequestState requestState = deviceAuthDialog.h;
                            if (requestState != null) {
                                yb0.a(requestState.b);
                            }
                            LoginClient.Request request = deviceAuthDialog.k;
                            if (request == null) {
                                deviceAuthDialog.f();
                            } else {
                                deviceAuthDialog.l(request);
                            }
                        } else if (i2 != 1349173) {
                            com.facebook.u uVar = facebookRequestError.i;
                            if (uVar == null) {
                                uVar = new com.facebook.u();
                            }
                            deviceAuthDialog.g(uVar);
                        } else {
                            deviceAuthDialog.f();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = n0Var.b;
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            String string = jSONObject.getString("access_token");
                            string.getClass();
                            deviceAuthDialog.h(jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")), string);
                        } catch (JSONException e) {
                            deviceAuthDialog.g(new com.facebook.u(e));
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                n0Var.getClass();
                if (!deviceAuthDialog.i) {
                    FacebookRequestError facebookRequestError2 = n0Var.d;
                    if (facebookRequestError2 != null) {
                        com.facebook.u uVar2 = facebookRequestError2.i;
                        if (uVar2 == null) {
                            uVar2 = new com.facebook.u();
                        }
                        deviceAuthDialog.g(uVar2);
                    } else {
                        JSONObject jSONObject2 = n0Var.b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        DeviceAuthDialog.RequestState requestState2 = new DeviceAuthDialog.RequestState();
                        try {
                            String string2 = jSONObject2.getString("user_code");
                            requestState2.b = string2;
                            requestState2.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                            requestState2.c = jSONObject2.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
                            requestState2.d = jSONObject2.getLong("interval");
                            deviceAuthDialog.k(requestState2);
                        } catch (JSONException e2) {
                            deviceAuthDialog.g(new com.facebook.u(e2));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
