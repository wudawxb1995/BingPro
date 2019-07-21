import request from '@/utils/request'

export function fetch(){
    return request({
        url : '/',
        method: 'get'
    })
}