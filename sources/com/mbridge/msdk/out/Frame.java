package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Frame {
    private List<CampaignEx> campaigns;
    private String parentSessionId;
    private String sessionId;
    private int template;

    public List<CampaignEx> getCampaigns() {
        return this.campaigns;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public int getTemplate() {
        return this.template;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.campaigns = list;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setTemplate(int i) {
        this.template = i;
    }
}
