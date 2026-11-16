package com.inmobi.media;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import defpackage.zr0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Gk implements AppLovinCommunicatorSubscriber {
    public final /* synthetic */ zr0 a;

    public Gk(zr0 zr0Var) {
        this.a = zr0Var;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        appLovinCommunicatorMessage.getClass();
        Uri data = appLovinCommunicatorMessage.getData();
        appLovinCommunicatorMessage.getTopic();
        Objects.toString(data);
        zr0 zr0Var = this.a;
        Bundle messageData = appLovinCommunicatorMessage.getMessageData();
        String topic = appLovinCommunicatorMessage.getTopic();
        topic.getClass();
        zr0Var.invoke(messageData, topic);
    }
}
