package com.mooc.meetingfilm.film.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mooc.backendutils.exception.CommonServiceException;
import com.mooc.meetingfilm.film.conroller.vo.DescribeActorsRespVO;
import com.mooc.meetingfilm.film.conroller.vo.DescribeFilmsRespVO;
import com.mooc.meetingfilm.film.conroller.vo.FilmSavedReqVO;
import org.springframework.stereotype.Service;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.film.service
 * @date 2021/5/29 2:24
 */

@Service
public class FilmServiceImpl implements FilmServiceAPI {
    @Override
    public IPage<DescribeActorsRespVO> describeActors(int nowPage, int pageSize) throws CommonServiceException {

        return null;
    }

    @Override
    public IPage<DescribeFilmsRespVO> describeFilms(int nowPage, int pageSize) throws CommonServiceException {
        return null;
    }

    @Override
    public DescribeFilmsRespVO describeFilmById(String filmId) throws CommonServiceException {
        return null;
    }

    @Override
    public void saveFilm(FilmSavedReqVO filmSavedReqVO) throws CommonServiceException {

    }
}