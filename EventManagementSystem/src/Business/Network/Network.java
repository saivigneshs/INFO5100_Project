/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Saivignesh Sridhar
 */
public class Network {

    private String name;
    private String code;
    private String imgPath;

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    private int igLimit;
    private int ogLimit;
    private String maskMandatory;

    public int getIgLimit() {
        return igLimit;
    }

    public void setIgLimit(int igLimit) {
        this.igLimit = igLimit;
    }

    public int getOgLimit() {
        return ogLimit;
    }

    public void setOgLimit(int ogLimit) {
        this.ogLimit = ogLimit;
    }

    public String getMaskMandatory() {
        return maskMandatory;
    }

    public void setMaskMandatory(String maskMandatory) {
        this.maskMandatory = maskMandatory;
    }
    private final EnterpriseDirectory enterpriseDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}
