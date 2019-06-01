package com.sky.ad.service;

import com.sky.ad.vo.CreativeRequest;
import com.sky.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
