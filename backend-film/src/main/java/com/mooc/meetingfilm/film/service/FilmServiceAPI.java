package com.mooc.meetingfilm.film.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mooc.backendutils.exception.CommonServiceException;
import com.mooc.meetingfilm.film.conroller.vo.DescribeActorsRespVO;
import com.mooc.meetingfilm.film.conroller.vo.DescribeFilmsRespVO;
import com.mooc.meetingfilm.film.conroller.vo.FilmSavedReqVO;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.film.service
 * @date 2021/5/29 2:24
 */
public interface FilmServiceAPI {

    // 获取演员列表
    IPage<DescribeActorsRespVO> describeActors(int nowPage,int pageSize) throws CommonServiceException;

    // 获取电影列表
    IPage<DescribeFilmsRespVO> describeFilms(int nowPage, int pageSize) throws CommonServiceException;

    // 根据主键获取电影信息
    DescribeFilmsRespVO describeFilmById(String filmId) throws CommonServiceException;

    // 保存电影信息
    void saveFilm(FilmSavedReqVO filmSavedReqVO) throws CommonServiceException;


}