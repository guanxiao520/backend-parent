package com.mooc.meetingfilm.film.conroller.vo;

import com.mooc.backendutils.common.vo.BaseRequestVO;
import com.mooc.backendutils.exception.CommonServiceException;
import lombok.Data;

/**
 * @author : jiangzh
 * @program : com.mooc.meetingfilm.film.controller.vo
 * @description : 保存电影信息对象
 **/
@Data
public class FilmSavedReqVO extends BaseRequestVO {

    private String filmStatus;
    private String filmName;
    private String filmEnName;
    private String mainImgAddress;
    private String filmScore;
    private String filmScorers;
    private String preSaleNum;
    private String boxOffice;
    private String filmTypeId;
    private String filmSourceId;
    private String filmCatIds;
    private String areaId;
    private String dateId;
    private String filmTime;
    private String directorId;
    private String actIds;      // actIds与RoleNames是不是能在数量上对应上
    private String roleNames;
    private String filmLength;
    private String biography;
    private String filmImgs;

    @Override
    public void checkParam() throws CommonServiceException {

    }
}
