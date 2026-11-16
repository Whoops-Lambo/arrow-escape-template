package com.bytedance.sdk.component.adexpress.ct;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.utils.wy;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz {
    private ahm ahm;
    private WeakReference<ahm> kgy;

    @JavascriptInterface
    public String adInfo() {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.adInfo();
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.appInfo();
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.appInfo();
    }

    @JavascriptInterface
    public String changeVideoState(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.changeVideoState(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.changeVideoState(str);
    }

    @JavascriptInterface
    public String clickEvent(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.clickEvent(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.clickEvent(str);
    }

    @JavascriptInterface
    public String dynamicTrack(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.dynamicTrack(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.getCurrentVideoState();
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.getData(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.getTemplateInfo();
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.getTemplateInfo();
    }

    @JavascriptInterface
    public String initRenderFinish() {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.initRenderFinish();
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.initRenderFinish();
    }

    @JavascriptInterface
    public String muteVideo(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.muteVideo(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.muteVideo(str);
    }

    @JavascriptInterface
    public String renderDidFinish(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.renderDidFinish(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.renderDidFinish(str);
    }

    @JavascriptInterface
    public String requestPauseVideo(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.kgy(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.kgy(str);
    }

    @JavascriptInterface
    public String skipVideo() {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.skipVideo();
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.skipVideo();
    }

    @JavascriptInterface
    public String videoFrameChanged(String str) {
        ahm ahmVar;
        ahm ahmVar2 = this.ahm;
        if (ahmVar2 != null) {
            return ahmVar2.videoFrameChanged(str);
        }
        WeakReference<ahm> weakReference = this.kgy;
        return (weakReference == null || (ahmVar = weakReference.get()) == null) ? "" : ahmVar.videoFrameChanged(str);
    }

    public rz(ahm ahmVar) {
        kgy(ahmVar);
    }

    public void kgy(ahm ahmVar) {
        if (wy.kgy()) {
            this.ahm = ahmVar;
            this.kgy = null;
        } else {
            this.kgy = new WeakReference<>(ahmVar);
            this.ahm = null;
        }
    }
}
