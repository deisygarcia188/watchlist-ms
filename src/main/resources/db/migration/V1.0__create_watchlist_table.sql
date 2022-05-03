create table public.tb_watchlist (
    id_watchlist serial primary key,
    id_usuario int NOT NULL,
    nombre varchar(255) NOT NULL,
    descripcion varchar(255) NOT NULL,
    privacidad boolean ,
    created_at timestamp,
    updated_at timestamp
)