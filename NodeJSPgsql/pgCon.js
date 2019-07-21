/* 
实现PGSQL+nodejs的增删改查
*/
const pgsql = require('pg');
const connection = pgsql.Pool({
    host: 'localhost',
    port: 5432,
    user: 'postgres',
    password: '123123',
    database: 'BINGDB',
    poolSize: 5,
});

/**
 * @function query_func 查询
 * 
 */
var query_func = () => {
    connection.connect()
        .then(qur => {
            let sql_qur = 'select * from "public"."Gov_Manager" '
            qur.query(sql_qur, (err, res_qur) => {
                if (err) {
                    console.log(err);
                }
                console.log(res_qur);
                qur.release(true);
                return res_qur;
            })
        })
}
/**
 * @function delet_func 删除
 */
var delet_func = (ID_dell) => {
    connection.connect()
        .then(qur_del => {
            let sql_del = 'delete from "public"."Gov_Manager" where "public"."Gov_Manager"."ID"= $1';
            let ID_del = [ID_dell]
            qur_del.query(sql_del, ID_del, (err, res_del) => {
                if (err) {
                    console.log(err);
                    return
                }
                console.log(res_del);
                qur_del.release(true);
                return
            })
        })
}
/**
 * @function insert_func 插入（先查询，根据已有的数量界定ID号）
 */
var insert_func = () => {
    connection.connect()
        .then(qur => {
            let sql_count = 'select count("public"."Gov_Manager"."ID") from "public"."Gov_Manager"'
            qur.query(sql_count)
                .then(res => {
                    let sql_insert = 'INSERT INTO "public"."Gov_Manager" ("ID", "department", "ManageLevel") VALUES ($1::integer,$2::varchar,$3::integer)'
                    let addParam = [+res.rows[0].count + 1, '冰冰NODEJS神盾局', 1]
                    // console.log(+res.rows[0].count)
                    qur.query(sql_insert, addParam, (err, res_ins) => {
                        if (err) {
                            console.log(err);
                            return
                        }
                        console.log(res_ins)
                        // 释放连接，不然内存会浪费
                        qur.release(true)
                        return
                    })
                })
        })
}
/**
 * @function update_fun 更新操作
 */
var update_fun = () => {
    connection.connect()
        .then(update_qur => {
            let update_sql = 'UPDATE "public"."Gov_Manager" SET "department" = $2,"ManageLevel"=$3 WHERE "public"."Gov_Manager"."ID"=$1';
            let updataId = [11, '冰冰神盾安全局', '2']
            update_qur.query(update_sql, updataId, (err, res_update) => {
                if (err) {
                    console.log(err)
                    return
                }
                console.log(res_update);
                update_qur.release(true);
                return
            })
        })
}
// insert_func()
// query_func()
// update_fun()
// delet_func(1)
connection.end();
